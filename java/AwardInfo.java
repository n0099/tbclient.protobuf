package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AwardInfo> {
        public Long award_act_id;
        public Long award_id;
        public String award_imgsrc;
        public String award_name;

        public Builder() {
        }

        public Builder(AwardInfo awardInfo) {
            super(awardInfo);
            if (awardInfo == null) {
                return;
            }
            this.award_id = awardInfo.award_id;
            this.award_act_id = awardInfo.award_act_id;
            this.award_name = awardInfo.award_name;
            this.award_imgsrc = awardInfo.award_imgsrc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AwardInfo build(boolean z) {
            return new AwardInfo(this, z);
        }
    }

    public AwardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.award_id;
            if (l == null) {
                this.award_id = DEFAULT_AWARD_ID;
            } else {
                this.award_id = l;
            }
            Long l2 = builder.award_act_id;
            if (l2 == null) {
                this.award_act_id = DEFAULT_AWARD_ACT_ID;
            } else {
                this.award_act_id = l2;
            }
            String str = builder.award_name;
            if (str == null) {
                this.award_name = "";
            } else {
                this.award_name = str;
            }
            String str2 = builder.award_imgsrc;
            if (str2 == null) {
                this.award_imgsrc = "";
                return;
            } else {
                this.award_imgsrc = str2;
                return;
            }
        }
        this.award_id = builder.award_id;
        this.award_act_id = builder.award_act_id;
        this.award_name = builder.award_name;
        this.award_imgsrc = builder.award_imgsrc;
    }
}
