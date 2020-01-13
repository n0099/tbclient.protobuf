package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Position extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer card;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer frs;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer home;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pb;
    public static final Integer DEFAULT_FRS = 0;
    public static final Integer DEFAULT_PB = 0;
    public static final Integer DEFAULT_HOME = 0;
    public static final Integer DEFAULT_CARD = 0;

    private Position(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.frs == null) {
                this.frs = DEFAULT_FRS;
            } else {
                this.frs = builder.frs;
            }
            if (builder.pb == null) {
                this.pb = DEFAULT_PB;
            } else {
                this.pb = builder.pb;
            }
            if (builder.home == null) {
                this.home = DEFAULT_HOME;
            } else {
                this.home = builder.home;
            }
            if (builder.card == null) {
                this.card = DEFAULT_CARD;
                return;
            } else {
                this.card = builder.card;
                return;
            }
        }
        this.frs = builder.frs;
        this.pb = builder.pb;
        this.home = builder.home;
        this.card = builder.card;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Position> {
        public Integer card;
        public Integer frs;
        public Integer home;
        public Integer pb;

        public Builder() {
        }

        public Builder(Position position) {
            super(position);
            if (position != null) {
                this.frs = position.frs;
                this.pb = position.pb;
                this.home = position.home;
                this.card = position.card;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Position build(boolean z) {
            return new Position(this, z);
        }
    }
}
