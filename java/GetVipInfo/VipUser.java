package tbclient.GetVipInfo;

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
public final class VipUser extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CARD_ID = "";
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final Integer DEFAULT_NOW_TIME;
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SPEED_LINK = "";
    public static final Integer DEFAULT_TASK_SCORES;
    public static final String DEFAULT_TASK_SCORES_LINK = "";
    public static final String DEFAULT_TOTAL_SCORES_LINK = "";
    public static final String DEFAULT_VIP_LINK = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8)
    public final VipParrScores Parr_scores;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String card_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer now_time;
    @ProtoField(tag = 5)
    public final VipPayMemberInfo pay_member_info;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String speed_link;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer task_scores;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String task_scores_link;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String total_scores_link;
    @ProtoField(tag = 6)
    public final VipInfo vipInfo;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String vip_link;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipUser> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public VipParrScores Parr_scores;
        public String card_id;
        public Long id;
        public String name;
        public String name_show;
        public Integer now_time;
        public VipPayMemberInfo pay_member_info;
        public String portrait;
        public String speed_link;
        public Integer task_scores;
        public String task_scores_link;
        public String total_scores_link;
        public VipInfo vipInfo;
        public String vip_link;

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
        public Builder(VipUser vipUser) {
            super(vipUser);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {vipUser};
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
            if (vipUser == null) {
                return;
            }
            this.name = vipUser.name;
            this.id = vipUser.id;
            this.portrait = vipUser.portrait;
            this.name_show = vipUser.name_show;
            this.pay_member_info = vipUser.pay_member_info;
            this.vipInfo = vipUser.vipInfo;
            this.now_time = vipUser.now_time;
            this.Parr_scores = vipUser.Parr_scores;
            this.task_scores = vipUser.task_scores;
            this.total_scores_link = vipUser.total_scores_link;
            this.speed_link = vipUser.speed_link;
            this.task_scores_link = vipUser.task_scores_link;
            this.vip_link = vipUser.vip_link;
            this.card_id = vipUser.card_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipUser build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VipUser(this, z, null) : (VipUser) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(934454595, "Ltbclient/GetVipInfo/VipUser;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(934454595, "Ltbclient/GetVipInfo/VipUser;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_NOW_TIME = 0;
        DEFAULT_TASK_SCORES = 0;
    }

    public /* synthetic */ VipUser(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipUser(Builder builder, boolean z) {
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
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.name_show;
            if (str3 == null) {
                this.name_show = "";
            } else {
                this.name_show = str3;
            }
            this.pay_member_info = builder.pay_member_info;
            this.vipInfo = builder.vipInfo;
            Integer num = builder.now_time;
            if (num == null) {
                this.now_time = DEFAULT_NOW_TIME;
            } else {
                this.now_time = num;
            }
            this.Parr_scores = builder.Parr_scores;
            Integer num2 = builder.task_scores;
            if (num2 == null) {
                this.task_scores = DEFAULT_TASK_SCORES;
            } else {
                this.task_scores = num2;
            }
            String str4 = builder.total_scores_link;
            if (str4 == null) {
                this.total_scores_link = "";
            } else {
                this.total_scores_link = str4;
            }
            String str5 = builder.speed_link;
            if (str5 == null) {
                this.speed_link = "";
            } else {
                this.speed_link = str5;
            }
            String str6 = builder.task_scores_link;
            if (str6 == null) {
                this.task_scores_link = "";
            } else {
                this.task_scores_link = str6;
            }
            String str7 = builder.vip_link;
            if (str7 == null) {
                this.vip_link = "";
            } else {
                this.vip_link = str7;
            }
            String str8 = builder.card_id;
            if (str8 == null) {
                this.card_id = "";
                return;
            } else {
                this.card_id = str8;
                return;
            }
        }
        this.name = builder.name;
        this.id = builder.id;
        this.portrait = builder.portrait;
        this.name_show = builder.name_show;
        this.pay_member_info = builder.pay_member_info;
        this.vipInfo = builder.vipInfo;
        this.now_time = builder.now_time;
        this.Parr_scores = builder.Parr_scores;
        this.task_scores = builder.task_scores;
        this.total_scores_link = builder.total_scores_link;
        this.speed_link = builder.speed_link;
        this.task_scores_link = builder.task_scores_link;
        this.vip_link = builder.vip_link;
        this.card_id = builder.card_id;
    }
}
