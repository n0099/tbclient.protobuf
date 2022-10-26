package tbclient.HomePage;

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
public final class GodInfoItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_GOD_INTRO = "";
    public static final Long DEFAULT_UID;
    public static final String DEFAULT_USER_INTRO = "";
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String god_intro;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_intro;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public String god_intro;
        public Long uid;
        public String user_intro;
        public String user_name;

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
        public Builder(GodInfoItem godInfoItem) {
            super(godInfoItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {godInfoItem};
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
            if (godInfoItem == null) {
                return;
            }
            this.uid = godInfoItem.uid;
            this.avatar = godInfoItem.avatar;
            this.user_name = godInfoItem.user_name;
            this.user_intro = godInfoItem.user_intro;
            this.god_intro = godInfoItem.god_intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodInfoItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new GodInfoItem(this, z, null);
            }
            return (GodInfoItem) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-669323211, "Ltbclient/HomePage/GodInfoItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-669323211, "Ltbclient/HomePage/GodInfoItem;");
                return;
            }
        }
        DEFAULT_UID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GodInfoItem(Builder builder, boolean z) {
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
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str = builder.avatar;
            if (str == null) {
                this.avatar = "";
            } else {
                this.avatar = str;
            }
            String str2 = builder.user_name;
            if (str2 == null) {
                this.user_name = "";
            } else {
                this.user_name = str2;
            }
            String str3 = builder.user_intro;
            if (str3 == null) {
                this.user_intro = "";
            } else {
                this.user_intro = str3;
            }
            String str4 = builder.god_intro;
            if (str4 == null) {
                this.god_intro = "";
                return;
            } else {
                this.god_intro = str4;
                return;
            }
        }
        this.uid = builder.uid;
        this.avatar = builder.avatar;
        this.user_name = builder.user_name;
        this.user_intro = builder.user_intro;
        this.god_intro = builder.god_intro;
    }

    public /* synthetic */ GodInfoItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
