package tbclient.Personalized;

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
import tbclient.AlaLiveInfo;
/* loaded from: classes9.dex */
public final class UserFollowLive extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_SWITCH;
    public static final List<AlaLiveInfo> DEFAULT_USER_FOLLOW_LIVE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer _switch;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AlaLiveInfo> user_follow_live;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserFollowLive> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer _switch;
        public List<AlaLiveInfo> user_follow_live;

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
        public Builder(UserFollowLive userFollowLive) {
            super(userFollowLive);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userFollowLive};
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
            if (userFollowLive == null) {
                return;
            }
            this.user_follow_live = Message.copyOf(userFollowLive.user_follow_live);
            this._switch = userFollowLive._switch;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserFollowLive build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new UserFollowLive(this, z, null) : (UserFollowLive) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1451538338, "Ltbclient/Personalized/UserFollowLive;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1451538338, "Ltbclient/Personalized/UserFollowLive;");
                return;
            }
        }
        DEFAULT_USER_FOLLOW_LIVE = Collections.emptyList();
        DEFAULT_SWITCH = 0;
    }

    public /* synthetic */ UserFollowLive(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFollowLive(Builder builder, boolean z) {
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
            List<AlaLiveInfo> list = builder.user_follow_live;
            if (list == null) {
                this.user_follow_live = DEFAULT_USER_FOLLOW_LIVE;
            } else {
                this.user_follow_live = Message.immutableCopyOf(list);
            }
            Integer num = builder._switch;
            if (num == null) {
                this._switch = DEFAULT_SWITCH;
                return;
            } else {
                this._switch = num;
                return;
            }
        }
        this.user_follow_live = Message.immutableCopyOf(builder.user_follow_live);
        this._switch = builder._switch;
    }
}
