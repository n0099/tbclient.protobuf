package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class LotteryTheme extends Message {
    public static final String DEFAULT_BGCOLOR = "";
    public static final String DEFAULT_BGIMAGE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bgcolor;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bgimage;

    private LotteryTheme(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.bgcolor == null) {
                this.bgcolor = "";
            } else {
                this.bgcolor = builder.bgcolor;
            }
            if (builder.bgimage == null) {
                this.bgimage = "";
                return;
            } else {
                this.bgimage = builder.bgimage;
                return;
            }
        }
        this.bgcolor = builder.bgcolor;
        this.bgimage = builder.bgimage;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<LotteryTheme> {
        public String bgcolor;
        public String bgimage;

        public Builder() {
        }

        public Builder(LotteryTheme lotteryTheme) {
            super(lotteryTheme);
            if (lotteryTheme != null) {
                this.bgcolor = lotteryTheme.bgcolor;
                this.bgimage = lotteryTheme.bgimage;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LotteryTheme build(boolean z) {
            return new LotteryTheme(this, z);
        }
    }
}
