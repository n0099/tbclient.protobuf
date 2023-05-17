package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
import tbclient.HistoryForumInfo;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static final List<HistoryForumInfo> DEFAULT_HISTORY_FORUM = Collections.emptyList();
    public static final List<FrsTabInfo> DEFAULT_NAV_TAB_INFO = Collections.emptyList();
    public static final List<HistoryForumInfo> DEFAULT_THIS_WEEK_FORUMS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<HistoryForumInfo> history_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FrsTabInfo> nav_tab_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<HistoryForumInfo> this_week_forums;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<HistoryForumInfo> history_forum;
        public List<FrsTabInfo> nav_tab_info;
        public List<HistoryForumInfo> this_week_forums;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.history_forum = Message.copyOf(dataRes.history_forum);
            this.nav_tab_info = Message.copyOf(dataRes.nav_tab_info);
            this.this_week_forums = Message.copyOf(dataRes.this_week_forums);
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
            List<HistoryForumInfo> list = builder.history_forum;
            if (list == null) {
                this.history_forum = DEFAULT_HISTORY_FORUM;
            } else {
                this.history_forum = Message.immutableCopyOf(list);
            }
            List<FrsTabInfo> list2 = builder.nav_tab_info;
            if (list2 == null) {
                this.nav_tab_info = DEFAULT_NAV_TAB_INFO;
            } else {
                this.nav_tab_info = Message.immutableCopyOf(list2);
            }
            List<HistoryForumInfo> list3 = builder.this_week_forums;
            if (list3 == null) {
                this.this_week_forums = DEFAULT_THIS_WEEK_FORUMS;
                return;
            } else {
                this.this_week_forums = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.history_forum = Message.immutableCopyOf(builder.history_forum);
        this.nav_tab_info = Message.immutableCopyOf(builder.nav_tab_info);
        this.this_week_forums = Message.immutableCopyOf(builder.this_week_forums);
    }
}
