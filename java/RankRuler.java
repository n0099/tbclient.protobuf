package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class RankRuler extends Message {
    public static final String DEFAULT_BOTTOM_LINK = "";
    public static final String DEFAULT_TOP_LINK = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bottom_link;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String top_link;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RankRuler> {
        public String bottom_link;
        public String top_link;

        public Builder() {
        }

        public Builder(RankRuler rankRuler) {
            super(rankRuler);
            if (rankRuler == null) {
                return;
            }
            this.top_link = rankRuler.top_link;
            this.bottom_link = rankRuler.bottom_link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RankRuler build(boolean z) {
            return new RankRuler(this, z);
        }
    }

    public RankRuler(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.top_link;
            if (str == null) {
                this.top_link = "";
            } else {
                this.top_link = str;
            }
            String str2 = builder.bottom_link;
            if (str2 == null) {
                this.bottom_link = "";
                return;
            } else {
                this.bottom_link = str2;
                return;
            }
        }
        this.top_link = builder.top_link;
        this.bottom_link = builder.bottom_link;
    }
}
