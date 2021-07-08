package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ServiceArea extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_PICURL = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SERVICENAME = "";
    public static final String DEFAULT_SERVICEURL = "";
    public static final String DEFAULT_SERVICE_TYPE = "";
    public static final List<String> DEFAULT_THIRD_STATISTICS_URL;
    public static final String DEFAULT_VERSION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6)
    public final SmartApp area_smart_app;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String picurl;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String service_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String servicename;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String serviceurl;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> third_statistics_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String version;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ServiceArea> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public SmartApp area_smart_app;
        public String picurl;
        public String schema;
        public String service_type;
        public String servicename;
        public String serviceurl;
        public List<String> third_statistics_url;
        public String version;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ServiceArea serviceArea) {
            super(serviceArea);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {serviceArea};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (serviceArea == null) {
                return;
            }
            this.servicename = serviceArea.servicename;
            this.picurl = serviceArea.picurl;
            this.serviceurl = serviceArea.serviceurl;
            this.version = serviceArea.version;
            this.service_type = serviceArea.service_type;
            this.area_smart_app = serviceArea.area_smart_app;
            this.schema = serviceArea.schema;
            this.third_statistics_url = Message.copyOf(serviceArea.third_statistics_url);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ServiceArea build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ServiceArea(this, z, null) : (ServiceArea) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1207075453, "Ltbclient/ServiceArea;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1207075453, "Ltbclient/ServiceArea;");
                return;
            }
        }
        DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
    }

    public /* synthetic */ ServiceArea(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceArea(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.servicename;
            if (str == null) {
                this.servicename = "";
            } else {
                this.servicename = str;
            }
            String str2 = builder.picurl;
            if (str2 == null) {
                this.picurl = "";
            } else {
                this.picurl = str2;
            }
            String str3 = builder.serviceurl;
            if (str3 == null) {
                this.serviceurl = "";
            } else {
                this.serviceurl = str3;
            }
            String str4 = builder.version;
            if (str4 == null) {
                this.version = "";
            } else {
                this.version = str4;
            }
            String str5 = builder.service_type;
            if (str5 == null) {
                this.service_type = "";
            } else {
                this.service_type = str5;
            }
            this.area_smart_app = builder.area_smart_app;
            String str6 = builder.schema;
            if (str6 == null) {
                this.schema = "";
            } else {
                this.schema = str6;
            }
            List<String> list = builder.third_statistics_url;
            if (list == null) {
                this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
                return;
            } else {
                this.third_statistics_url = Message.immutableCopyOf(list);
                return;
            }
        }
        this.servicename = builder.servicename;
        this.picurl = builder.picurl;
        this.serviceurl = builder.serviceurl;
        this.version = builder.version;
        this.service_type = builder.service_type;
        this.area_smart_app = builder.area_smart_app;
        this.schema = builder.schema;
        this.third_statistics_url = Message.immutableCopyOf(builder.third_statistics_url);
    }
}
