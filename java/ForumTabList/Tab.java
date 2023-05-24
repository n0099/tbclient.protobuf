package tbclient.ForumTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Tab extends Message {
    public static final String DEFAULT_SEQ = "";
    public static final String DEFAULT_TAB_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String seq;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tab_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer tab_type;
    public static final Long DEFAULT_TAB_ID = 0L;
    public static final Integer DEFAULT_TAB_TYPE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Tab> {
        public String seq;
        public Long tab_id;
        public String tab_name;
        public Integer tab_type;

        public Builder() {
        }

        public Builder(Tab tab) {
            super(tab);
            if (tab == null) {
                return;
            }
            this.tab_id = tab.tab_id;
            this.tab_name = tab.tab_name;
            this.seq = tab.seq;
            this.tab_type = tab.tab_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Tab build(boolean z) {
            return new Tab(this, z);
        }
    }

    public Tab(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tab_id;
            if (l == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = l;
            }
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            String str2 = builder.seq;
            if (str2 == null) {
                this.seq = "";
            } else {
                this.seq = str2;
            }
            Integer num = builder.tab_type;
            if (num == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
                return;
            } else {
                this.tab_type = num;
                return;
            }
        }
        this.tab_id = builder.tab_id;
        this.tab_name = builder.tab_name;
        this.seq = builder.seq;
        this.tab_type = builder.tab_type;
    }
}
