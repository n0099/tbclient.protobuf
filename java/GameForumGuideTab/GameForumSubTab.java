package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumSubLabel;
/* loaded from: classes.dex */
public final class GameForumSubTab extends Message {
    public static final Integer DEFAULT_ID = 0;
    public static final List<ForumSubLabel> DEFAULT_SUB_LABEL_LIST = Collections.emptyList();
    public static final String DEFAULT_SUB_TAB_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ForumSubLabel> sub_label_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_tab_name;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GameForumSubTab> {
        public Integer id;
        public List<ForumSubLabel> sub_label_list;
        public String sub_tab_name;

        public Builder() {
        }

        public Builder(GameForumSubTab gameForumSubTab) {
            super(gameForumSubTab);
            if (gameForumSubTab == null) {
                return;
            }
            this.id = gameForumSubTab.id;
            this.sub_tab_name = gameForumSubTab.sub_tab_name;
            this.sub_label_list = Message.copyOf(gameForumSubTab.sub_label_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameForumSubTab build(boolean z) {
            return new GameForumSubTab(this, z);
        }
    }

    public GameForumSubTab(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.sub_tab_name;
            if (str == null) {
                this.sub_tab_name = "";
            } else {
                this.sub_tab_name = str;
            }
            List<ForumSubLabel> list = builder.sub_label_list;
            if (list == null) {
                this.sub_label_list = DEFAULT_SUB_LABEL_LIST;
                return;
            } else {
                this.sub_label_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.id = builder.id;
        this.sub_tab_name = builder.sub_tab_name;
        this.sub_label_list = Message.immutableCopyOf(builder.sub_label_list);
    }
}
