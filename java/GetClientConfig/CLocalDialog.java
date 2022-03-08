package tbclient.GetClientConfig;

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
public final class CLocalDialog extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PICTURE = "";
    public static final Integer DEFAULT_SHOW;
    public static final String DEFAULT_TIME = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_URL_IOS = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String picture;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer show;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String url_ios;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CLocalDialog> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String name;
        public String picture;
        public Integer show;
        public String time;
        public String title;
        public String url;
        public String url_ios;

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
        public Builder(CLocalDialog cLocalDialog) {
            super(cLocalDialog);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {cLocalDialog};
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
            if (cLocalDialog == null) {
                return;
            }
            this.picture = cLocalDialog.picture;
            this.show = cLocalDialog.show;
            this.time = cLocalDialog.time;
            this.title = cLocalDialog.title;
            this.url = cLocalDialog.url;
            this.name = cLocalDialog.name;
            this.url_ios = cLocalDialog.url_ios;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CLocalDialog build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new CLocalDialog(this, z, null) : (CLocalDialog) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1565598101, "Ltbclient/GetClientConfig/CLocalDialog;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1565598101, "Ltbclient/GetClientConfig/CLocalDialog;");
                return;
            }
        }
        DEFAULT_SHOW = 0;
    }

    public /* synthetic */ CLocalDialog(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLocalDialog(Builder builder, boolean z) {
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
            String str = builder.picture;
            if (str == null) {
                this.picture = "";
            } else {
                this.picture = str;
            }
            Integer num = builder.show;
            if (num == null) {
                this.show = DEFAULT_SHOW;
            } else {
                this.show = num;
            }
            String str2 = builder.time;
            if (str2 == null) {
                this.time = "";
            } else {
                this.time = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
            } else {
                this.url = str4;
            }
            String str5 = builder.name;
            if (str5 == null) {
                this.name = "";
            } else {
                this.name = str5;
            }
            String str6 = builder.url_ios;
            if (str6 == null) {
                this.url_ios = "";
                return;
            } else {
                this.url_ios = str6;
                return;
            }
        }
        this.picture = builder.picture;
        this.show = builder.show;
        this.time = builder.time;
        this.title = builder.title;
        this.url = builder.url;
        this.name = builder.name;
        this.url_ios = builder.url_ios;
    }
}
