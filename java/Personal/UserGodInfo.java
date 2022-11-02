package tbclient.Personal;

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
public final class UserGodInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<ForumGodDetailInfo> DEFAULT_FORUM_GOD_LIST;
    public static final Integer DEFAULT_GOD_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ForumGodDetailInfo> forum_god_list;
    @ProtoField(tag = 2)
    public final GodDetailInfo god_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer god_type;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserGodInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<ForumGodDetailInfo> forum_god_list;
        public GodDetailInfo god_info;
        public Integer god_type;

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
        public Builder(UserGodInfo userGodInfo) {
            super(userGodInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userGodInfo};
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
            if (userGodInfo == null) {
                return;
            }
            this.god_type = userGodInfo.god_type;
            this.god_info = userGodInfo.god_info;
            this.forum_god_list = Message.copyOf(userGodInfo.forum_god_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserGodInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new UserGodInfo(this, z, null);
            }
            return (UserGodInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1471154175, "Ltbclient/Personal/UserGodInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1471154175, "Ltbclient/Personal/UserGodInfo;");
                return;
            }
        }
        DEFAULT_GOD_TYPE = 0;
        DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGodInfo(Builder builder, boolean z) {
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
            Integer num = builder.god_type;
            if (num == null) {
                this.god_type = DEFAULT_GOD_TYPE;
            } else {
                this.god_type = num;
            }
            this.god_info = builder.god_info;
            List<ForumGodDetailInfo> list = builder.forum_god_list;
            if (list == null) {
                this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
                return;
            } else {
                this.forum_god_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.god_type = builder.god_type;
        this.god_info = builder.god_info;
        this.forum_god_list = Message.immutableCopyOf(builder.forum_god_list);
    }

    public /* synthetic */ UserGodInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
