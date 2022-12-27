package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class LotteryRegular extends Message {
    public static final List<Integer> DEFAULT_CHANCE = Collections.emptyList();
    public static final String DEFAULT_REGULAR = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
    public final List<Integer> chance;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String regular;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LotteryRegular> {
        public List<Integer> chance;
        public String regular;

        public Builder() {
        }

        public Builder(LotteryRegular lotteryRegular) {
            super(lotteryRegular);
            if (lotteryRegular == null) {
                return;
            }
            this.regular = lotteryRegular.regular;
            this.chance = Message.copyOf(lotteryRegular.chance);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LotteryRegular build(boolean z) {
            return new LotteryRegular(this, z);
        }
    }

    public LotteryRegular(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.regular;
            if (str == null) {
                this.regular = "";
            } else {
                this.regular = str;
            }
            List<Integer> list = builder.chance;
            if (list == null) {
                this.chance = DEFAULT_CHANCE;
                return;
            } else {
                this.chance = Message.immutableCopyOf(list);
                return;
            }
        }
        this.regular = builder.regular;
        this.chance = Message.immutableCopyOf(builder.chance);
    }
}
