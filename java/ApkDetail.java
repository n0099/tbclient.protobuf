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
/* loaded from: classes2.dex */
public final class ApkDetail extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AUTHORITY_URL = "";
    public static final String DEFAULT_DEVELOPER = "";
    public static final Integer DEFAULT_NEED_INNER_BUY;
    public static final Integer DEFAULT_NEED_NETWORK;
    public static final Integer DEFAULT_PKG_SOURCE;
    public static final String DEFAULT_PRIVACY_URL = "";
    public static final String DEFAULT_PUBLISHER = "";
    public static final String DEFAULT_SIZE = "";
    public static final String DEFAULT_UPDATE_TIME = "";
    public static final String DEFAULT_VERSION = "";
    public static final Integer DEFAULT_VERSION_CODE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String authority_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String developer;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer need_inner_buy;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer need_network;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer pkg_source;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String privacy_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String publisher;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String size;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String update_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String version;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer version_code;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ApkDetail> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String authority_url;
        public String developer;
        public Integer need_inner_buy;
        public Integer need_network;
        public Integer pkg_source;
        public String privacy_url;
        public String publisher;
        public String size;
        public String update_time;
        public String version;
        public Integer version_code;

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
        public Builder(ApkDetail apkDetail) {
            super(apkDetail);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {apkDetail};
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
            if (apkDetail == null) {
                return;
            }
            this.developer = apkDetail.developer;
            this.publisher = apkDetail.publisher;
            this.version = apkDetail.version;
            this.version_code = apkDetail.version_code;
            this.update_time = apkDetail.update_time;
            this.size = apkDetail.size;
            this.need_network = apkDetail.need_network;
            this.need_inner_buy = apkDetail.need_inner_buy;
            this.authority_url = apkDetail.authority_url;
            this.privacy_url = apkDetail.privacy_url;
            this.pkg_source = apkDetail.pkg_source;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ApkDetail build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ApkDetail(this, z, null) : (ApkDetail) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-429902664, "Ltbclient/ApkDetail;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-429902664, "Ltbclient/ApkDetail;");
                return;
            }
        }
        DEFAULT_VERSION_CODE = 0;
        DEFAULT_NEED_NETWORK = 0;
        DEFAULT_NEED_INNER_BUY = 0;
        DEFAULT_PKG_SOURCE = 0;
    }

    public /* synthetic */ ApkDetail(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApkDetail(Builder builder, boolean z) {
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
            String str = builder.developer;
            if (str == null) {
                this.developer = "";
            } else {
                this.developer = str;
            }
            String str2 = builder.publisher;
            if (str2 == null) {
                this.publisher = "";
            } else {
                this.publisher = str2;
            }
            String str3 = builder.version;
            if (str3 == null) {
                this.version = "";
            } else {
                this.version = str3;
            }
            Integer num = builder.version_code;
            if (num == null) {
                this.version_code = DEFAULT_VERSION_CODE;
            } else {
                this.version_code = num;
            }
            String str4 = builder.update_time;
            if (str4 == null) {
                this.update_time = "";
            } else {
                this.update_time = str4;
            }
            String str5 = builder.size;
            if (str5 == null) {
                this.size = "";
            } else {
                this.size = str5;
            }
            Integer num2 = builder.need_network;
            if (num2 == null) {
                this.need_network = DEFAULT_NEED_NETWORK;
            } else {
                this.need_network = num2;
            }
            Integer num3 = builder.need_inner_buy;
            if (num3 == null) {
                this.need_inner_buy = DEFAULT_NEED_INNER_BUY;
            } else {
                this.need_inner_buy = num3;
            }
            String str6 = builder.authority_url;
            if (str6 == null) {
                this.authority_url = "";
            } else {
                this.authority_url = str6;
            }
            String str7 = builder.privacy_url;
            if (str7 == null) {
                this.privacy_url = "";
            } else {
                this.privacy_url = str7;
            }
            Integer num4 = builder.pkg_source;
            if (num4 == null) {
                this.pkg_source = DEFAULT_PKG_SOURCE;
                return;
            } else {
                this.pkg_source = num4;
                return;
            }
        }
        this.developer = builder.developer;
        this.publisher = builder.publisher;
        this.version = builder.version;
        this.version_code = builder.version_code;
        this.update_time = builder.update_time;
        this.size = builder.size;
        this.need_network = builder.need_network;
        this.need_inner_buy = builder.need_inner_buy;
        this.authority_url = builder.authority_url;
        this.privacy_url = builder.privacy_url;
        this.pkg_source = builder.pkg_source;
    }
}
