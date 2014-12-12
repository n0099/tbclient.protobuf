package tbclient.GameIndex;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class ResData extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<AdList> ad_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<CategoryList> category_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GameInfo> hot_rank;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<GameInfo> new_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GameInfo> recommend_list;
    public static final List<GameInfo> DEFAULT_HOT_RANK = Collections.emptyList();
    public static final List<GameInfo> DEFAULT_RECOMMEND_LIST = Collections.emptyList();
    public static final List<GameInfo> DEFAULT_NEW_LIST = Collections.emptyList();
    public static final List<CategoryList> DEFAULT_CATEGORY_LIST = Collections.emptyList();
    public static final List<AdList> DEFAULT_AD_LIST = Collections.emptyList();

    /* synthetic */ ResData(Builder builder, boolean z, ResData resData) {
        this(builder, z);
    }

    private ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.hot_rank == null) {
                this.hot_rank = DEFAULT_HOT_RANK;
            } else {
                this.hot_rank = immutableCopyOf(builder.hot_rank);
            }
            if (builder.recommend_list == null) {
                this.recommend_list = DEFAULT_RECOMMEND_LIST;
            } else {
                this.recommend_list = immutableCopyOf(builder.recommend_list);
            }
            if (builder.new_list == null) {
                this.new_list = DEFAULT_NEW_LIST;
            } else {
                this.new_list = immutableCopyOf(builder.new_list);
            }
            if (builder.category_list == null) {
                this.category_list = DEFAULT_CATEGORY_LIST;
            } else {
                this.category_list = immutableCopyOf(builder.category_list);
            }
            if (builder.ad_list == null) {
                this.ad_list = DEFAULT_AD_LIST;
                return;
            } else {
                this.ad_list = immutableCopyOf(builder.ad_list);
                return;
            }
        }
        this.hot_rank = immutableCopyOf(builder.hot_rank);
        this.recommend_list = immutableCopyOf(builder.recommend_list);
        this.new_list = immutableCopyOf(builder.new_list);
        this.category_list = immutableCopyOf(builder.category_list);
        this.ad_list = immutableCopyOf(builder.ad_list);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ResData> {
        public List<AdList> ad_list;
        public List<CategoryList> category_list;
        public List<GameInfo> hot_rank;
        public List<GameInfo> new_list;
        public List<GameInfo> recommend_list;

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.hot_rank = ResData.copyOf(resData.hot_rank);
                this.recommend_list = ResData.copyOf(resData.recommend_list);
                this.new_list = ResData.copyOf(resData.new_list);
                this.category_list = ResData.copyOf(resData.category_list);
                this.ad_list = ResData.copyOf(resData.ad_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
