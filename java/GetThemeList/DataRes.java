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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThemeCarousel> carousel;
        public ThemeRecommand recommend;
        public List<ThemeList> theme_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.theme_list = Message.copyOf(dataRes.theme_list);
            this.carousel = Message.copyOf(dataRes.carousel);
            this.recommend = dataRes.recommend;
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
            List<ThemeList> list = builder.theme_list;
            if (list == null) {
                this.theme_list = DEFAULT_THEME_LIST;
            } else {
                this.theme_list = Message.immutableCopyOf(list);
            }
            List<ThemeCarousel> list2 = builder.carousel;
            if (list2 == null) {
                this.carousel = DEFAULT_CAROUSEL;
            } else {
                this.carousel = Message.immutableCopyOf(list2);
            }
            this.recommend = builder.recommend;
            return;
        }
        this.theme_list = Message.immutableCopyOf(builder.theme_list);
        this.carousel = Message.immutableCopyOf(builder.carousel);
        this.recommend = builder.recommend;
    }
}
