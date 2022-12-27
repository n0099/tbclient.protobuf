package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Bottle extends Message {
    public static final Integer DEFAULT_HAS_ENTER_DISPLAY = 0;
    public static final Long DEFAULT_TID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_enter_display;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Bottle> {
        public Integer has_enter_display;
        public Long tid;

        public Builder() {
        }

        public Builder(Bottle bottle) {
            super(bottle);
            if (bottle == null) {
                return;
            }
            this.has_enter_display = bottle.has_enter_display;
            this.tid = bottle.tid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Bottle build(boolean z) {
            return new Bottle(this, z);
        }
    }

    public Bottle(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.has_enter_display;
            if (num == null) {
                this.has_enter_display = DEFAULT_HAS_ENTER_DISPLAY;
            } else {
                this.has_enter_display = num;
            }
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = l;
                return;
            }
        }
        this.has_enter_display = builder.has_enter_display;
        this.tid = builder.tid;
    }
}
