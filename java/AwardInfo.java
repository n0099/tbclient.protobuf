package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class AwardInfo extends Message {
    public static final String DEFAULT_AWARD_IMGSRC = "";
    public static final String DEFAULT_AWARD_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long award_act_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long award_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String award_imgsrc;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String award_name;
    public static final Long DEFAULT_AWARD_ID = 0L;
    public static final Long DEFAULT_AWARD_ACT_ID = 0L;

    private AwardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.award_id == null) {
                this.award_id = DEFAULT_AWARD_ID;
            } else {
                this.award_id = builder.award_id;
            }
            if (builder.award_act_id == null) {
                this.award_act_id = DEFAULT_AWARD_ACT_ID;
            } else {
                this.award_act_id = builder.award_act_id;
            }
            if (builder.award_name == null) {
                this.award_name = "";
            } else {
                this.award_name = builder.award_name;
            }
            if (builder.award_imgsrc == null) {
                this.award_imgsrc = "";
                return;
            } else {
                this.award_imgsrc = builder.award_imgsrc;
                return;
            }
        }
        this.award_id = builder.award_id;
        this.award_act_id = builder.award_act_id;
        this.award_name = builder.award_name;
        this.award_imgsrc = builder.award_imgsrc;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<AwardInfo> {
        public Long award_act_id;
        public Long award_id;
        public String award_imgsrc;
        public String award_name;

        public Builder() {
        }

        public Builder(AwardInfo awardInfo) {
            super(awardInfo);
            if (awardInfo != null) {
                this.award_id = awardInfo.award_id;
                this.award_act_id = awardInfo.award_act_id;
                this.award_name = awardInfo.award_name;
                this.award_imgsrc = awardInfo.award_imgsrc;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AwardInfo build(boolean z) {
            return new AwardInfo(this, z);
        }
    }
}
