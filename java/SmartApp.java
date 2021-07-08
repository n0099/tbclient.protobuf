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
/* loaded from: classes9.dex */
public final class SmartApp extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_H5_URL = "";
    public static final String DEFAULT_ID = "";
    public static final Integer DEFAULT_IS_GAME;
    public static final Integer DEFAULT_IS_RECOM;
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PIC = "";
    public static final Long DEFAULT_SWAN_APP_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String h5_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_game;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_recom;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long swan_app_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SmartApp> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public String avatar;
        public String h5_url;
        public String id;
        public Integer is_game;
        public Integer is_recom;
        public String link;
        public String name;
        public String pic;
        public Long swan_app_id;

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
        public Builder(SmartApp smartApp) {
            super(smartApp);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {smartApp};
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
            if (smartApp == null) {
                return;
            }
            this.avatar = smartApp.avatar;
            this.name = smartApp.name;
            this._abstract = smartApp._abstract;
            this.pic = smartApp.pic;
            this.h5_url = smartApp.h5_url;
            this.id = smartApp.id;
            this.link = smartApp.link;
            this.swan_app_id = smartApp.swan_app_id;
            this.is_recom = smartApp.is_recom;
            this.is_game = smartApp.is_game;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SmartApp build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SmartApp(this, z, null) : (SmartApp) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1541270023, "Ltbclient/SmartApp;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1541270023, "Ltbclient/SmartApp;");
                return;
            }
        }
        DEFAULT_SWAN_APP_ID = 0L;
        DEFAULT_IS_RECOM = 0;
        DEFAULT_IS_GAME = 0;
    }

    public /* synthetic */ SmartApp(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartApp(Builder builder, boolean z) {
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
            String str = builder.avatar;
            if (str == null) {
                this.avatar = "";
            } else {
                this.avatar = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder._abstract;
            if (str3 == null) {
                this._abstract = "";
            } else {
                this._abstract = str3;
            }
            String str4 = builder.pic;
            if (str4 == null) {
                this.pic = "";
            } else {
                this.pic = str4;
            }
            String str5 = builder.h5_url;
            if (str5 == null) {
                this.h5_url = "";
            } else {
                this.h5_url = str5;
            }
            String str6 = builder.id;
            if (str6 == null) {
                this.id = "";
            } else {
                this.id = str6;
            }
            String str7 = builder.link;
            if (str7 == null) {
                this.link = "";
            } else {
                this.link = str7;
            }
            Long l = builder.swan_app_id;
            if (l == null) {
                this.swan_app_id = DEFAULT_SWAN_APP_ID;
            } else {
                this.swan_app_id = l;
            }
            Integer num = builder.is_recom;
            if (num == null) {
                this.is_recom = DEFAULT_IS_RECOM;
            } else {
                this.is_recom = num;
            }
            Integer num2 = builder.is_game;
            if (num2 == null) {
                this.is_game = DEFAULT_IS_GAME;
                return;
            } else {
                this.is_game = num2;
                return;
            }
        }
        this.avatar = builder.avatar;
        this.name = builder.name;
        this._abstract = builder._abstract;
        this.pic = builder.pic;
        this.h5_url = builder.h5_url;
        this.id = builder.id;
        this.link = builder.link;
        this.swan_app_id = builder.swan_app_id;
        this.is_recom = builder.is_recom;
        this.is_game = builder.is_game;
    }
}
