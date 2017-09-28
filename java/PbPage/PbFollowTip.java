package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PbFollowTip extends Message {
    public static final Integer DEFAULT_IS_TOAST_TIP = 0;
    public static final String DEFAULT_TIP_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_toast_tip;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tip_text;

    private PbFollowTip(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_toast_tip == null) {
                this.is_toast_tip = DEFAULT_IS_TOAST_TIP;
            } else {
                this.is_toast_tip = builder.is_toast_tip;
            }
            if (builder.tip_text == null) {
                this.tip_text = "";
                return;
            } else {
                this.tip_text = builder.tip_text;
                return;
            }
        }
        this.is_toast_tip = builder.is_toast_tip;
        this.tip_text = builder.tip_text;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PbFollowTip> {
        public Integer is_toast_tip;
        public String tip_text;

        public Builder() {
        }

        public Builder(PbFollowTip pbFollowTip) {
            super(pbFollowTip);
            if (pbFollowTip != null) {
                this.is_toast_tip = pbFollowTip.is_toast_tip;
                this.tip_text = pbFollowTip.tip_text;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbFollowTip build(boolean z) {
            return new PbFollowTip(this, z);
        }
    }
}
