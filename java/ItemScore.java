package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class ItemScore extends Message {
    public static final String DEFAULT_KEY = "";
    public static final Integer DEFAULT_SCORE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer score;

    private ItemScore(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.key == null) {
                this.key = "";
            } else {
                this.key = builder.key;
            }
            if (builder.score == null) {
                this.score = DEFAULT_SCORE;
                return;
            } else {
                this.score = builder.score;
                return;
            }
        }
        this.key = builder.key;
        this.score = builder.score;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ItemScore> {
        public String key;
        public Integer score;

        public Builder() {
        }

        public Builder(ItemScore itemScore) {
            super(itemScore);
            if (itemScore != null) {
                this.key = itemScore.key;
                this.score = itemScore.score;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemScore build(boolean z) {
            return new ItemScore(this, z);
        }
    }
}
