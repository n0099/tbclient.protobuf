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
import tbclient.ForumMember;
import tbclient.MemberGroupInfo;
import tbclient.PriManagerApplyInfo;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_IS_BAWUAPPLY_SHOW;
    public static final Integer DEFAULT_IS_PRIVATE_FORUM;
    public static final List<MemberGroupInfo> DEFAULT_MEMBER_GROUP_INFO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2)
    public final ForumMember forum_member_info;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_bawuapply_show;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_private_forum;
    @ProtoField(tag = 4)
    public final ManagerApplyInfo manager_apply_info;
    @ProtoField(tag = 3)
    public final MemberGodInfo member_god_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<MemberGroupInfo> member_group_info;
    @ProtoField(tag = 7)
    public final PriManagerApplyInfo primanager_apply_info;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ForumMember forum_member_info;
        public Integer is_bawuapply_show;
        public Integer is_private_forum;
        public ManagerApplyInfo manager_apply_info;
        public MemberGodInfo member_god_info;
        public List<MemberGroupInfo> member_group_info;
        public PriManagerApplyInfo primanager_apply_info;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.member_group_info = Message.copyOf(dataRes.member_group_info);
            this.forum_member_info = dataRes.forum_member_info;
            this.member_god_info = dataRes.member_god_info;
            this.manager_apply_info = dataRes.manager_apply_info;
            this.is_private_forum = dataRes.is_private_forum;
            this.is_bawuapply_show = dataRes.is_bawuapply_show;
            this.primanager_apply_info = dataRes.primanager_apply_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(777115776, "Ltbclient/GetMemberInfo/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(777115776, "Ltbclient/GetMemberInfo/DataRes;");
                return;
            }
        }
        DEFAULT_MEMBER_GROUP_INFO = Collections.emptyList();
        DEFAULT_IS_PRIVATE_FORUM = 0;
        DEFAULT_IS_BAWUAPPLY_SHOW = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            List<MemberGroupInfo> list = builder.member_group_info;
            if (list == null) {
                this.member_group_info = DEFAULT_MEMBER_GROUP_INFO;
            } else {
                this.member_group_info = Message.immutableCopyOf(list);
            }
            this.forum_member_info = builder.forum_member_info;
            this.member_god_info = builder.member_god_info;
            this.manager_apply_info = builder.manager_apply_info;
            Integer num = builder.is_private_forum;
            if (num == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
            } else {
                this.is_private_forum = num;
            }
            Integer num2 = builder.is_bawuapply_show;
            if (num2 == null) {
                this.is_bawuapply_show = DEFAULT_IS_BAWUAPPLY_SHOW;
            } else {
                this.is_bawuapply_show = num2;
            }
            this.primanager_apply_info = builder.primanager_apply_info;
            return;
        }
        this.member_group_info = Message.immutableCopyOf(builder.member_group_info);
        this.forum_member_info = builder.forum_member_info;
        this.member_god_info = builder.member_god_info;
        this.manager_apply_info = builder.manager_apply_info;
        this.is_private_forum = builder.is_private_forum;
        this.is_bawuapply_show = builder.is_bawuapply_show;
        this.primanager_apply_info = builder.primanager_apply_info;
    }
}
