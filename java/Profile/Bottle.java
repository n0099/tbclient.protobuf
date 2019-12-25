package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class Bottle extends Message {
    public static final Integer DEFAULT_HAS_ENTER_DISPLAY = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_enter_display;

    private Bottle(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.has_enter_display == null) {
                this.has_enter_display = DEFAULT_HAS_ENTER_DISPLAY;
                return;
            } else {
                this.has_enter_display = builder.has_enter_display;
                return;
            }
        }
        this.has_enter_display = builder.has_enter_display;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<Bottle> {
        public Integer has_enter_display;

        public Builder() {
        }

        public Builder(Bottle bottle) {
            super(bottle);
            if (bottle != null) {
                this.has_enter_display = bottle.has_enter_display;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Bottle build(boolean z) {
            return new Bottle(this, z);
        }
    }
}
