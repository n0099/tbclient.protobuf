package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class VipUser extends Message {
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SPEED_LINK = "";
    public static final String DEFAULT_TASK_SCORES_LINK = "";
    public static final String DEFAULT_TOTAL_SCORES_LINK = "";
    public static final String DEFAULT_VIP_LINK = "";
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
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_NOW_TIME = 0;
    public static final Integer DEFAULT_TASK_SCORES = 0;

    private VipUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.name_show == null) {
                this.name_show = "";
            } else {
                this.name_show = builder.name_show;
            }
            this.pay_member_info = builder.pay_member_info;
            this.vipInfo = builder.vipInfo;
            if (builder.now_time == null) {
                this.now_time = DEFAULT_NOW_TIME;
            } else {
                this.now_time = builder.now_time;
            }
            this.Parr_scores = builder.Parr_scores;
            if (builder.task_scores == null) {
                this.task_scores = DEFAULT_TASK_SCORES;
            } else {
                this.task_scores = builder.task_scores;
            }
            if (builder.total_scores_link == null) {
                this.total_scores_link = "";
            } else {
                this.total_scores_link = builder.total_scores_link;
            }
            if (builder.speed_link == null) {
                this.speed_link = "";
            } else {
                this.speed_link = builder.speed_link;
            }
            if (builder.task_scores_link == null) {
                this.task_scores_link = "";
            } else {
                this.task_scores_link = builder.task_scores_link;
            }
            if (builder.vip_link == null) {
                this.vip_link = "";
            } else {
                this.vip_link = builder.vip_link;
            }
            if (builder.card_id == null) {
                this.card_id = "";
                return;
            } else {
                this.card_id = builder.card_id;
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<VipUser> {
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
        }

        public Builder(VipUser vipUser) {
            super(vipUser);
            if (vipUser != null) {
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
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipUser build(boolean z) {
            return new VipUser(this, z);
        }
    }
}
