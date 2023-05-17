package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemePendantInMain> pendant;
    @ProtoField(tag = 1)
    public final ThemeRecommand recommend;
    public static final List<ThemePendantInMain> DEFAULT_PENDANT = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_more;
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
            this.has_more = dataRes.has_more;
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
            } else {
                this.pendant = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.recommend = builder.recommend;
        this.pendant = Message.immutableCopyOf(builder.pendant);
        this.has_more = builder.has_more;
    }
}
