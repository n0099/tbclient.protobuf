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
public final class PluginUser extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_IS_DOWNLOAD_CARD_WHITEUSER;
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME_SHOW = "";
    public static final String DEFAULT_USER_PHOTO = "";
    public static final Integer DEFAULT_USER_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_download_card_whiteuser;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name_show;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_photo;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PluginUser> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_download_card_whiteuser;
        public Long user_id;
        public String user_name_show;
        public String user_photo;
        public Integer user_type;

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
        public Builder(PluginUser pluginUser) {
            super(pluginUser);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pluginUser};
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
            if (pluginUser == null) {
                return;
            }
            this.user_id = pluginUser.user_id;
            this.user_name_show = pluginUser.user_name_show;
            this.user_type = pluginUser.user_type;
            this.user_photo = pluginUser.user_photo;
            this.is_download_card_whiteuser = pluginUser.is_download_card_whiteuser;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PluginUser build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PluginUser(this, z, null) : (PluginUser) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1793865933, "Ltbclient/PluginUser;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1793865933, "Ltbclient/PluginUser;");
                return;
            }
        }
        DEFAULT_USER_ID = 0L;
        DEFAULT_USER_TYPE = 0;
        DEFAULT_IS_DOWNLOAD_CARD_WHITEUSER = 0;
    }

    public /* synthetic */ PluginUser(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginUser(Builder builder, boolean z) {
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
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name_show;
            if (str == null) {
                this.user_name_show = "";
            } else {
                this.user_name_show = str;
            }
            Integer num = builder.user_type;
            if (num == null) {
                this.user_type = DEFAULT_USER_TYPE;
            } else {
                this.user_type = num;
            }
            String str2 = builder.user_photo;
            if (str2 == null) {
                this.user_photo = "";
            } else {
                this.user_photo = str2;
            }
            Integer num2 = builder.is_download_card_whiteuser;
            if (num2 == null) {
                this.is_download_card_whiteuser = DEFAULT_IS_DOWNLOAD_CARD_WHITEUSER;
                return;
            } else {
                this.is_download_card_whiteuser = num2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name_show = builder.user_name_show;
        this.user_type = builder.user_type;
        this.user_photo = builder.user_photo;
        this.is_download_card_whiteuser = builder.is_download_card_whiteuser;
    }
}
