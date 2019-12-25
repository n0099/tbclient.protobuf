package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class Balv extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer days_tofree;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_black;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_block;
    public static final Integer DEFAULT_IS_BLACK = 0;
    public static final Integer DEFAULT_IS_BLOCK = 0;
    public static final Integer DEFAULT_DAYS_TOFREE = 0;

    private Balv(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_black == null) {
                this.is_black = DEFAULT_IS_BLACK;
            } else {
                this.is_black = builder.is_black;
            }
            if (builder.is_block == null) {
                this.is_block = DEFAULT_IS_BLOCK;
            } else {
                this.is_block = builder.is_block;
            }
            if (builder.days_tofree == null) {
                this.days_tofree = DEFAULT_DAYS_TOFREE;
                return;
            } else {
                this.days_tofree = builder.days_tofree;
                return;
            }
        }
        this.is_black = builder.is_black;
        this.is_block = builder.is_block;
        this.days_tofree = builder.days_tofree;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<Balv> {
        public Integer days_tofree;
        public Integer is_black;
        public Integer is_block;

        public Builder() {
        }

        public Builder(Balv balv) {
            super(balv);
            if (balv != null) {
                this.is_black = balv.is_black;
                this.is_block = balv.is_block;
                this.days_tofree = balv.days_tofree;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Balv build(boolean z) {
            return new Balv(this, z);
        }
    }
}
