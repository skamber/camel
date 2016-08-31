/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.jetty9.springboot;

import java.util.Map;
import org.apache.camel.component.jetty.JettyHttpBinding;
import org.apache.camel.http.common.HttpBinding;
import org.apache.camel.http.common.HttpConfiguration;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.eclipse.jetty.jmx.MBeanContainer;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.handler.ErrorHandler;
import org.eclipse.jetty.util.thread.ThreadPool;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The jetty component provides HTTP-based endpoints for consuming and producing
 * HTTP requests.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.jetty")
public class JettyHttpComponentConfiguration9 {

    /**
     * The key password which is used to access the certificate's key entry in
     * the keystore (this is the same password that is supplied to the keystore
     * command's -keypass option).
     */
    private String sslKeyPassword;
    /**
     * The ssl password which is required to access the keystore file (this is
     * the same password that is supplied to the keystore command's -storepass
     * option).
     */
    private String sslPassword;
    /**
     * Specifies the location of the Java keystore file which contains the Jetty
     * server's own X.509 certificate in a key entry.
     */
    private String keystore;
    /**
     * This option is used to set the ErrorHandler that Jetty server uses.
     */
    private ErrorHandler errorHandler;
    /**
     * A map which contains per port number specific SSL connectors.
     */
    private Map<Integer, Connector> sslSocketConnectors;
    /**
     * A map which contains per port number specific HTTP connectors. Uses the
     * same principle as sslSocketConnectors.
     */
    private Map<Integer, Connector> socketConnectors;
    /**
     * To set a value for minimum number of threads in HttpClient thread pool.
     * Notice that both a min and max size must be configured.
     */
    private Integer httpClientMinThreads;
    /**
     * To set a value for maximum number of threads in HttpClient thread pool.
     * Notice that both a min and max size must be configured.
     */
    private Integer httpClientMaxThreads;
    /**
     * To set a value for minimum number of threads in server thread pool.
     * Notice that both a min and max size must be configured.
     */
    private Integer minThreads;
    /**
     * To set a value for maximum number of threads in server thread pool.
     * Notice that both a min and max size must be configured.
     */
    private Integer maxThreads;
    /**
     * To use a custom thread pool for the server. This option should only be
     * used in special circumstances.
     */
    private ThreadPool threadPool;
    /**
     * If this option is true Jetty JMX support will be enabled for this
     * endpoint.
     */
    private Boolean enableJmx;
    /**
     * To use a custom org.apache.camel.component.jetty.JettyHttpBinding which
     * are used to customize how a response should be written for the producer.
     */
    private JettyHttpBinding jettyHttpBinding;
    /**
     * Not to be used - use JettyHttpBinding instead.
     */
    private HttpBinding httpBinding;
    /**
     * Jetty component does not use HttpConfiguration.
     */
    private HttpConfiguration httpConfiguration;
    /**
     * To use a existing configured org.eclipse.jetty.jmx.MBeanContainer if JMX
     * is enabled that Jetty uses for registering mbeans.
     */
    private MBeanContainer mbContainer;
    /**
     * A map which contains general SSL connector properties.
     */
    private Map<String, Object> sslSocketConnectorProperties;
    /**
     * A map which contains general HTTP connector properties. Uses the same
     * principle as sslSocketConnectorProperties.
     */
    private Map<String, Object> socketConnectorProperties;
    /**
     * Allows to set a timeout in millis when using Jetty as consumer (server).
     * By default Jetty uses 30000. You can use a value of = 0 to never expire.
     * If a timeout occurs then the request will be expired and Jetty will
     * return back a http error 503 to the client. This option is only in use
     * when using Jetty with the Asynchronous Routing Engine.
     */
    private Long continuationTimeout;
    /**
     * Whether or not to use Jetty continuations for the Jetty Server.
     */
    private Boolean useContinuation;
    /**
     * To configure security using SSLContextParameters
     */
    private SSLContextParameters sslContextParameters;
    /**
     * Allows to configure a custom value of the response buffer size on the
     * Jetty connectors.
     */
    private Integer responseBufferSize;
    /**
     * Allows to configure a custom value of the request buffer size on the
     * Jetty connectors.
     */
    private Integer requestBufferSize;
    /**
     * Allows to configure a custom value of the request header size on the
     * Jetty connectors.
     */
    private Integer requestHeaderSize;
    /**
     * Allows to configure a custom value of the response header size on the
     * Jetty connectors.
     */
    private Integer responseHeaderSize;
    /**
     * To use a http proxy to configure the hostname.
     */
    private String proxyHost;
    /**
     * To use a http proxy to configure the port number.
     */
    private Integer proxyPort;
    /**
     * To use the X-Forwarded-For header in HttpServletRequest.getRemoteAddr.
     */
    private Boolean useXForwardedForHeader;
    /**
     * If the option is true jetty server will send the date header to the
     * client which sends the request. NOTE please make sure there is no any
     * other camel-jetty endpoint is share the same port otherwise this option
     * may not work as expected.
     */
    private Boolean sendServerVersion;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject;
    /**
     * To use a custom HeaderFilterStrategy to filter header to and from Camel
     * message.
     */
    private HeaderFilterStrategy headerFilterStrategy;

    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    public void setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
    }

    public String getSslPassword() {
        return sslPassword;
    }

    public void setSslPassword(String sslPassword) {
        this.sslPassword = sslPassword;
    }

    public String getKeystore() {
        return keystore;
    }

    public void setKeystore(String keystore) {
        this.keystore = keystore;
    }

    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public Map<Integer, Connector> getSslSocketConnectors() {
        return sslSocketConnectors;
    }

    public void setSslSocketConnectors(
            Map<Integer, Connector> sslSocketConnectors) {
        this.sslSocketConnectors = sslSocketConnectors;
    }

    public Map<Integer, Connector> getSocketConnectors() {
        return socketConnectors;
    }

    public void setSocketConnectors(Map<Integer, Connector> socketConnectors) {
        this.socketConnectors = socketConnectors;
    }

    public Integer getHttpClientMinThreads() {
        return httpClientMinThreads;
    }

    public void setHttpClientMinThreads(Integer httpClientMinThreads) {
        this.httpClientMinThreads = httpClientMinThreads;
    }

    public Integer getHttpClientMaxThreads() {
        return httpClientMaxThreads;
    }

    public void setHttpClientMaxThreads(Integer httpClientMaxThreads) {
        this.httpClientMaxThreads = httpClientMaxThreads;
    }

    public Integer getMinThreads() {
        return minThreads;
    }

    public void setMinThreads(Integer minThreads) {
        this.minThreads = minThreads;
    }

    public Integer getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(Integer maxThreads) {
        this.maxThreads = maxThreads;
    }

    public ThreadPool getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(ThreadPool threadPool) {
        this.threadPool = threadPool;
    }

    public Boolean getEnableJmx() {
        return enableJmx;
    }

    public void setEnableJmx(Boolean enableJmx) {
        this.enableJmx = enableJmx;
    }

    public JettyHttpBinding getJettyHttpBinding() {
        return jettyHttpBinding;
    }

    public void setJettyHttpBinding(JettyHttpBinding jettyHttpBinding) {
        this.jettyHttpBinding = jettyHttpBinding;
    }

    public HttpBinding getHttpBinding() {
        return httpBinding;
    }

    public void setHttpBinding(HttpBinding httpBinding) {
        this.httpBinding = httpBinding;
    }

    public HttpConfiguration getHttpConfiguration() {
        return httpConfiguration;
    }

    public void setHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public MBeanContainer getMbContainer() {
        return mbContainer;
    }

    public void setMbContainer(MBeanContainer mbContainer) {
        this.mbContainer = mbContainer;
    }

    public Map<String, Object> getSslSocketConnectorProperties() {
        return sslSocketConnectorProperties;
    }

    public void setSslSocketConnectorProperties(
            Map<String, Object> sslSocketConnectorProperties) {
        this.sslSocketConnectorProperties = sslSocketConnectorProperties;
    }

    public Map<String, Object> getSocketConnectorProperties() {
        return socketConnectorProperties;
    }

    public void setSocketConnectorProperties(
            Map<String, Object> socketConnectorProperties) {
        this.socketConnectorProperties = socketConnectorProperties;
    }

    public Long getContinuationTimeout() {
        return continuationTimeout;
    }

    public void setContinuationTimeout(Long continuationTimeout) {
        this.continuationTimeout = continuationTimeout;
    }

    public Boolean getUseContinuation() {
        return useContinuation;
    }

    public void setUseContinuation(Boolean useContinuation) {
        this.useContinuation = useContinuation;
    }

    public SSLContextParameters getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(
            SSLContextParameters sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Integer getResponseBufferSize() {
        return responseBufferSize;
    }

    public void setResponseBufferSize(Integer responseBufferSize) {
        this.responseBufferSize = responseBufferSize;
    }

    public Integer getRequestBufferSize() {
        return requestBufferSize;
    }

    public void setRequestBufferSize(Integer requestBufferSize) {
        this.requestBufferSize = requestBufferSize;
    }

    public Integer getRequestHeaderSize() {
        return requestHeaderSize;
    }

    public void setRequestHeaderSize(Integer requestHeaderSize) {
        this.requestHeaderSize = requestHeaderSize;
    }

    public Integer getResponseHeaderSize() {
        return responseHeaderSize;
    }

    public void setResponseHeaderSize(Integer responseHeaderSize) {
        this.responseHeaderSize = responseHeaderSize;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Boolean getUseXForwardedForHeader() {
        return useXForwardedForHeader;
    }

    public void setUseXForwardedForHeader(Boolean useXForwardedForHeader) {
        this.useXForwardedForHeader = useXForwardedForHeader;
    }

    public Boolean getSendServerVersion() {
        return sendServerVersion;
    }

    public void setSendServerVersion(Boolean sendServerVersion) {
        this.sendServerVersion = sendServerVersion;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }
}