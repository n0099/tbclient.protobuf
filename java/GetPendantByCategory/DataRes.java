package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<ThemePendantInMain> DEFAULT_PENDANT = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemePendantInMain> pendant;
    @ProtoField(tag = 1)
    public final ThemeRecommand recommend;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThemePendantInMain> pendant;
        public ThemeRecommand recommend;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.recommend = dataRes.recommend;
            this.pendant = Message.copyOf(dataRes.pendant);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.recommend = builder.recommend;
            List<ThemePendantInMain> list = builder.pendant;
            if (list == null) {
                this.pendant = DEFAULT_PENDANT;
                return;
            } else {
                this.pendant = Message.immutableCopyOf(list);
                return;
            }
        }
        this.recommend = builder.recommend;
        this.pendant = Message.immutableCopyOf(builder.pendant);
    }
}
