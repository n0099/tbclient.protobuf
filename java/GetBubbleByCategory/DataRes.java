package tbclient.GetBubbleByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<ThemeBubbleInMain> DEFAULT_BUBBLES = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeBubbleInMain> bubbles;
    @ProtoField(tag = 1)
    public final ThemeRecommand recommend;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.recommend = builder.recommend;
            if (builder.bubbles == null) {
                this.bubbles = DEFAULT_BUBBLES;
                return;
            } else {
                this.bubbles = immutableCopyOf(builder.bubbles);
                return;
            }
        }
        this.recommend = builder.recommend;
        this.bubbles = immutableCopyOf(builder.bubbles);
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThemeBubbleInMain> bubbles;
        public ThemeRecommand recommend;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.recommend = dataRes.recommend;
                this.bubbles = DataRes.copyOf(dataRes.bubbles);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
