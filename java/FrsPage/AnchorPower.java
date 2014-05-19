package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AnchorPower extends Message {
    public static final String DEFAULT_ANCHOR_MESSAGE = "";
    public static final Integer DEFAULT_HAVE_POWER = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String anchor_message;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer have_power;

    /* synthetic */ AnchorPower(Builder builder, boolean z, AnchorPower anchorPower) {
        this(builder, z);
    }

    private AnchorPower(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.have_power == null) {
                this.have_power = DEFAULT_HAVE_POWER;
            } else {
                this.have_power = builder.have_power;
            }
            if (builder.anchor_message == null) {
                this.anchor_message = "";
                return;
            } else {
                this.anchor_message = builder.anchor_message;
                return;
            }
        }
        this.have_power = builder.have_power;
        this.anchor_message = builder.anchor_message;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<AnchorPower> {
        public String anchor_message;
        public Integer have_power;

        public Builder(AnchorPower anchorPower) {
            super(anchorPower);
            if (anchorPower != null) {
                this.have_power = anchorPower.have_power;
                this.anchor_message = anchorPower.anchor_message;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AnchorPower build(boolean z) {
            return new AnchorPower(this, z, null);
        }
    }
}
