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
public final class MemberGroupInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<BawuRoleInfoPub> DEFAULT_MEMBER_GROUP_LIST;
    public static final Integer DEFAULT_MEMBER_GROUP_NUM;
    public static final String DEFAULT_MEMBER_GROUP_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<BawuRoleInfoPub> member_group_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer member_group_num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String member_group_type;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MemberGroupInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<BawuRoleInfoPub> member_group_list;
        public Integer member_group_num;
        public String member_group_type;

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
        public Builder(MemberGroupInfo memberGroupInfo) {
            super(memberGroupInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {memberGroupInfo};
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
            if (memberGroupInfo == null) {
                return;
            }
            this.member_group_type = memberGroupInfo.member_group_type;
            this.member_group_num = memberGroupInfo.member_group_num;
            this.member_group_list = Message.copyOf(memberGroupInfo.member_group_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberGroupInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new MemberGroupInfo(this, z, null);
            }
            return (MemberGroupInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(162526514, "Ltbclient/MemberGroupInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(162526514, "Ltbclient/MemberGroupInfo;");
                return;
            }
        }
        DEFAULT_MEMBER_GROUP_NUM = 0;
        DEFAULT_MEMBER_GROUP_LIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberGroupInfo(Builder builder, boolean z) {
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
            String str = builder.member_group_type;
            if (str == null) {
                this.member_group_type = "";
            } else {
                this.member_group_type = str;
            }
            Integer num = builder.member_group_num;
            if (num == null) {
                this.member_group_num = DEFAULT_MEMBER_GROUP_NUM;
            } else {
                this.member_group_num = num;
            }
            List<BawuRoleInfoPub> list = builder.member_group_list;
            if (list == null) {
                this.member_group_list = DEFAULT_MEMBER_GROUP_LIST;
                return;
            } else {
                this.member_group_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.member_group_type = builder.member_group_type;
        this.member_group_num = builder.member_group_num;
        this.member_group_list = Message.immutableCopyOf(builder.member_group_list);
    }

    public /* synthetic */ MemberGroupInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
