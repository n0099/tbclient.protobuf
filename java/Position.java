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
            if (position == null) {
                return;
            }
            this.frs = position.frs;
            this.pb = position.pb;
            this.home = position.home;
            this.card = position.card;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Position build(boolean z) {
            return new Position(this, z);
        }
    }

    public Position(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.frs;
            if (num == null) {
                this.frs = DEFAULT_FRS;
            } else {
                this.frs = num;
            }
            Integer num2 = builder.pb;
            if (num2 == null) {
                this.pb = DEFAULT_PB;
            } else {
                this.pb = num2;
            }
            Integer num3 = builder.home;
            if (num3 == null) {
                this.home = DEFAULT_HOME;
            } else {
                this.home = num3;
            }
            Integer num4 = builder.card;
            if (num4 == null) {
                this.card = DEFAULT_CARD;
                return;
            } else {
                this.card = num4;
                return;
            }
        }
        this.frs = builder.frs;
        this.pb = builder.pb;
        this.home = builder.home;
        this.card = builder.card;
    }
}
