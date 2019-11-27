package co.com.entelgy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "quickstart")
public class QuickstartConfiguration {


    private String urlBroker;
    private String TimeOutBroker;
    private String jdbcConnection_Oracle;
    private String jdbcUserName_Oracle;
    private String jdbcPassword_Oracle;
    private String urlEndpoint_servie;
    private String codigoRespuesta_ErrorGeneral;
    private String codigo_ErrorEstructura;
    private String descripcion_ErrorEstructura;
    private String codigo_ErrorInterno;
    private String descripcion_ErrorInterno;
    private String codigo_ErrorProveedor;
    private String descripcion_ErrorProveedor;
    private String codigo_ErrorTimeOut;
    private String descripcion_ErrorTimeOut;
    
	public String getUrlBroker() {
		return urlBroker;
	}
	public void setUrlBroker(String urlBroker) {
		this.urlBroker = urlBroker;
	}
	public String getTimeOutBroker() {
		return TimeOutBroker;
	}
	public void setTimeOutBroker(String timeOutBroker) {
		TimeOutBroker = timeOutBroker;
	}
	public String getJdbcConnection_Oracle() {
		return jdbcConnection_Oracle;
	}
	public void setJdbcConnection_Oracle(String jdbcConnection_Oracle) {
		this.jdbcConnection_Oracle = jdbcConnection_Oracle;
	}
	public String getJdbcUserName_Oracle() {
		return jdbcUserName_Oracle;
	}
	public void setJdbcUserName_Oracle(String jdbcUserName_Oracle) {
		this.jdbcUserName_Oracle = jdbcUserName_Oracle;
	}
	public String getJdbcPassword_Oracle() {
		return jdbcPassword_Oracle;
	}
	public void setJdbcPassword_Oracle(String jdbcPassword_Oracle) {
		this.jdbcPassword_Oracle = jdbcPassword_Oracle;
	}
	public String getUrlEndpoint_servie() {
		return urlEndpoint_servie;
	}
	public void setUrlEndpoint_servie(String urlEndpoint_servie) {
		this.urlEndpoint_servie = urlEndpoint_servie;
	}
	public String getCodigoRespuesta_ErrorGeneral() {
		return codigoRespuesta_ErrorGeneral;
	}
	public void setCodigoRespuesta_ErrorGeneral(String codigoRespuesta_ErrorGeneral) {
		this.codigoRespuesta_ErrorGeneral = codigoRespuesta_ErrorGeneral;
	}
	public String getCodigo_ErrorEstructura() {
		return codigo_ErrorEstructura;
	}
	public void setCodigo_ErrorEstructura(String codigo_ErrorEstructura) {
		this.codigo_ErrorEstructura = codigo_ErrorEstructura;
	}
	public String getDescripcion_ErrorEstructura() {
		return descripcion_ErrorEstructura;
	}
	public void setDescripcion_ErrorEstructura(String descripcion_ErrorEstructura) {
		this.descripcion_ErrorEstructura = descripcion_ErrorEstructura;
	}
	public String getCodigo_ErrorInterno() {
		return codigo_ErrorInterno;
	}
	public void setCodigo_ErrorInterno(String codigo_ErrorInterno) {
		this.codigo_ErrorInterno = codigo_ErrorInterno;
	}
	public String getDescripcion_ErrorInterno() {
		return descripcion_ErrorInterno;
	}
	public void setDescripcion_ErrorInterno(String descripcion_ErrorInterno) {
		this.descripcion_ErrorInterno = descripcion_ErrorInterno;
	}
	public String getCodigo_ErrorProveedor() {
		return codigo_ErrorProveedor;
	}
	public void setCodigo_ErrorProveedor(String codigo_ErrorProveedor) {
		this.codigo_ErrorProveedor = codigo_ErrorProveedor;
	}
	public String getDescripcion_ErrorProveedor() {
		return descripcion_ErrorProveedor;
	}
	public void setDescripcion_ErrorProveedor(String descripcion_ErrorProveedor) {
		this.descripcion_ErrorProveedor = descripcion_ErrorProveedor;
	}
	public String getCodigo_ErrorTimeOut() {
		return codigo_ErrorTimeOut;
	}
	public void setCodigo_ErrorTimeOut(String codigo_ErrorTimeOut) {
		this.codigo_ErrorTimeOut = codigo_ErrorTimeOut;
	}
	public String getDescripcion_ErrorTimeOut() {
		return descripcion_ErrorTimeOut;
	}
	public void setDescripcion_ErrorTimeOut(String descripcion_ErrorTimeOut) {
		this.descripcion_ErrorTimeOut = descripcion_ErrorTimeOut;
	}
}
