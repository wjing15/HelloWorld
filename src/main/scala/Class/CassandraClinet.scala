package Class

import java.sql.ResultSet

import com.datastax.driver.core.Cluster

object CassandraClinet extends App {
  val HOSTS = "10.200.4.220"
  val KEYSPACE = "stage_things"
  private val cluster = Cluster.builder()
    .addContactPoint(HOSTS)
    .build()

  val session = cluster.connect(KEYSPACE)

  def getValueFromCassandraTable() = {
    val resultSet = session.execute("SELECT state_data FROM thing_state_jnl limit 1")
  }
  session.close()
}
