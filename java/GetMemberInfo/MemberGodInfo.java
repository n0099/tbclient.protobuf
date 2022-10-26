package tbclient.GetMemberInfo;

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
import tbclient.User;
/* loaded from: classes9.dex */
public final class MemberGodInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<User> DEFAULT_FORUM_GOD_LIST;
    public static final Integer DEFAULT_FORUM_GOD_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> forum_god_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer forum_god_num;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List forum_god_list;
        public Integer forum_god_num;

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
        public Builder(MemberGodInfo memberGodInfo) {
            super(memberGodInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {memberGodInfo};
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
            if (memberGodInfo == null) {
                return;
            }
            this.forum_god_list = Message.copyOf(memberGodInfo.forum_god_list);
            this.forum_god_num = memberGodInfo.forum_god_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberGodInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new MemberGodInfo(this, z, null);
            }
            return (MemberGodInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1751716038, "Ltbclient/GetMemberInfo/MemberGodInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1751716038, "Ltbclient/GetMemberInfo/MemberGodInfo;");
                return;
            }
        }
        DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
        DEFAULT_FORUM_GOD_NUM = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberGodInfo(Builder builder, boolean z) {
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
            List list = builder.forum_god_list;
            if (list == null) {
                this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
            } else {
                this.forum_god_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.forum_god_num;
            if (num == null) {
                this.forum_god_num = DEFAULT_FORUM_GOD_NUM;
                return;
            } else {
                this.forum_god_num = num;
                return;
            }
        }
        this.forum_god_list = Message.immutableCopyOf(builder.forum_god_list);
        this.forum_god_num = builder.forum_god_num;
    }

    public /* synthetic */ MemberGodInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
