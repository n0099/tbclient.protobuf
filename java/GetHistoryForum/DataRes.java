package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.HistoryForumInfo;
/* loaded from: classes16.dex */
public final class DataRes extends Message {
    public static final List<HistoryForumInfo> DEFAULT_HISTORY_FORUM = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<HistoryForumInfo> history_forum;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.history_forum == null) {
                this.history_forum = DEFAULT_HISTORY_FORUM;
                return;
            } else {
                this.history_forum = immutableCopyOf(builder.history_forum);
                return;
            }
        }
        this.history_forum = immutableCopyOf(builder.history_forum);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<HistoryForumInfo> history_forum;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.history_forum = DataRes.copyOf(dataRes.history_forum);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
