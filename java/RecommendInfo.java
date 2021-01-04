package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class RecommendInfo extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final List<SchoolRecomUserInfo> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SchoolRecomUserInfo> user_list;

    private RecommendInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
                return;
            }
        }
        this.title = builder.title;
        this.user_list = immutableCopyOf(builder.user_list);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecommendInfo> {
        public String title;
        public List<SchoolRecomUserInfo> user_list;

        public Builder() {
        }

        public Builder(RecommendInfo recommendInfo) {
            super(recommendInfo);
            if (recommendInfo != null) {
                this.title = recommendInfo.title;
                this.user_list = RecommendInfo.copyOf(recommendInfo.user_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendInfo build(boolean z) {
            return new RecommendInfo(this, z);
        }
    }
}
