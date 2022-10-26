package tbclient.GetWebviewCacheInfo;

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
/* loaded from: classes9.dex */
public final class Offpack extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_IS_USE;
    public static final String DEFAULT_MD5 = "";
    public static final String DEFAULT_MOD_NAME = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_WEBVIEW_VERSION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_use;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String md5;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String mod_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String webview_version;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_use;
        public String md5;
        public String mod_name;
        public String src;
        public String webview_version;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Offpack offpack) {
            super(offpack);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {offpack};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (offpack == null) {
                return;
            }
            this.mod_name = offpack.mod_name;
            this.src = offpack.src;
            this.md5 = offpack.md5;
            this.webview_version = offpack.webview_version;
            this.is_use = offpack.is_use;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Offpack build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Offpack(this, z, null);
            }
            return (Offpack) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1228724161, "Ltbclient/GetWebviewCacheInfo/Offpack;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1228724161, "Ltbclient/GetWebviewCacheInfo/Offpack;");
                return;
            }
        }
        DEFAULT_IS_USE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offpack(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.mod_name;
            if (str == null) {
                this.mod_name = "";
            } else {
                this.mod_name = str;
            }
            String str2 = builder.src;
            if (str2 == null) {
                this.src = "";
            } else {
                this.src = str2;
            }
            String str3 = builder.md5;
            if (str3 == null) {
                this.md5 = "";
            } else {
                this.md5 = str3;
            }
            String str4 = builder.webview_version;
            if (str4 == null) {
                this.webview_version = "";
            } else {
                this.webview_version = str4;
            }
            Integer num = builder.is_use;
            if (num == null) {
                this.is_use = DEFAULT_IS_USE;
                return;
            } else {
                this.is_use = num;
                return;
            }
        }
        this.mod_name = builder.mod_name;
        this.src = builder.src;
        this.md5 = builder.md5;
        this.webview_version = builder.webview_version;
        this.is_use = builder.is_use;
    }

    public /* synthetic */ Offpack(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
