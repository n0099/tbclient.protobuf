package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeCarousel> carousel;
    @ProtoField(tag = 3)
    public final ThemeRecommand recommend;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThemeList> theme_list;
    public static final List<ThemeList> DEFAULT_THEME_LIST = Collections.emptyList();
    public static final List<ThemeCarousel> DEFAULT_CAROUSEL = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.theme_list == null) {
                this.theme_list = DEFAULT_THEME_LIST;
            } else {
                this.theme_list = immutableCopyOf(builder.theme_list);
            }
            if (builder.carousel == null) {
                this.carousel = DEFAULT_CAROUSEL;
            } else {
                this.carousel = immutableCopyOf(builder.carousel);
            }
            this.recommend = builder.recommend;
            return;
        }
        this.theme_list = immutableCopyOf(builder.theme_list);
        this.carousel = immutableCopyOf(builder.carousel);
        this.recommend = builder.recommend;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThemeCarousel> carousel;
        public ThemeRecommand recommend;
        public List<ThemeList> theme_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.theme_list = DataRes.copyOf(dataRes.theme_list);
                this.carousel = DataRes.copyOf(dataRes.carousel);
                this.recommend = dataRes.recommend;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
