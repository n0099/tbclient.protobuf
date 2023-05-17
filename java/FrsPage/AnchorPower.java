package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class AnchorPower extends Message {
    public static final String DEFAULT_ANCHOR_MESSAGE = "";
    public static final String DEFAULT_CAN_ADD_LIVE_POST_MSG = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String anchor_message;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer can_add_live_post;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String can_add_live_post_msg;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer can_del_live_post;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer have_power;
    public static final Integer DEFAULT_HAVE_POWER = 0;
    public static final Integer DEFAULT_CAN_ADD_LIVE_POST = 0;
    public static final Integer DEFAULT_CAN_DEL_LIVE_POST = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AnchorPower> {
        public String anchor_message;
        public Integer can_add_live_post;
        public String can_add_live_post_msg;
        public Integer can_del_live_post;
        public Integer have_power;

        public Builder() {
        }

        public Builder(AnchorPower anchorPower) {
            super(anchorPower);
            if (anchorPower == null) {
                return;
            }
            this.have_power = anchorPower.have_power;
            this.anchor_message = anchorPower.anchor_message;
            this.can_add_live_post = anchorPower.can_add_live_post;
            this.can_del_live_post = anchorPower.can_del_live_post;
            this.can_add_live_post_msg = anchorPower.can_add_live_post_msg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AnchorPower build(boolean z) {
            return new AnchorPower(this, z);
        }
    }

    public AnchorPower(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.have_power;
            if (num == null) {
                this.have_power = DEFAULT_HAVE_POWER;
            } else {
                this.have_power = num;
            }
            String str = builder.anchor_message;
            if (str == null) {
                this.anchor_message = "";
            } else {
                this.anchor_message = str;
            }
            Integer num2 = builder.can_add_live_post;
            if (num2 == null) {
                this.can_add_live_post = DEFAULT_CAN_ADD_LIVE_POST;
            } else {
                this.can_add_live_post = num2;
            }
            Integer num3 = builder.can_del_live_post;
            if (num3 == null) {
                this.can_del_live_post = DEFAULT_CAN_DEL_LIVE_POST;
            } else {
                this.can_del_live_post = num3;
            }
            String str2 = builder.can_add_live_post_msg;
            if (str2 == null) {
                this.can_add_live_post_msg = "";
                return;
            } else {
                this.can_add_live_post_msg = str2;
                return;
            }
        }
        this.have_power = builder.have_power;
        this.anchor_message = builder.anchor_message;
        this.can_add_live_post = builder.can_add_live_post;
        this.can_del_live_post = builder.can_del_live_post;
        this.can_add_live_post_msg = builder.can_add_live_post_msg;
    }
}
