package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class KingkongPositionRow extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_ICON_SRC = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer action_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_src;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long last_update_time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer uni_id;
    public static final Long DEFAULT_LAST_UPDATE_TIME = 0L;
    public static final Integer DEFAULT_UNI_ID = 0;
    public static final Integer DEFAULT_ACTION_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<KingkongPositionRow> {
        public Integer action_type;
        public String desc;
        public String icon_src;
        public String jump_url;
        public Long last_update_time;
        public String title;
        public Integer uni_id;

        public Builder() {
        }

        public Builder(KingkongPositionRow kingkongPositionRow) {
            super(kingkongPositionRow);
            if (kingkongPositionRow == null) {
                return;
            }
            this.icon_src = kingkongPositionRow.icon_src;
            this.title = kingkongPositionRow.title;
            this.desc = kingkongPositionRow.desc;
            this.jump_url = kingkongPositionRow.jump_url;
            this.last_update_time = kingkongPositionRow.last_update_time;
            this.uni_id = kingkongPositionRow.uni_id;
            this.action_type = kingkongPositionRow.action_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public KingkongPositionRow build(boolean z) {
            return new KingkongPositionRow(this, z);
        }
    }

    public KingkongPositionRow(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_src;
            if (str == null) {
                this.icon_src = "";
            } else {
                this.icon_src = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            String str4 = builder.jump_url;
            if (str4 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str4;
            }
            Long l = builder.last_update_time;
            if (l == null) {
                this.last_update_time = DEFAULT_LAST_UPDATE_TIME;
            } else {
                this.last_update_time = l;
            }
            Integer num = builder.uni_id;
            if (num == null) {
                this.uni_id = DEFAULT_UNI_ID;
            } else {
                this.uni_id = num;
            }
            Integer num2 = builder.action_type;
            if (num2 == null) {
                this.action_type = DEFAULT_ACTION_TYPE;
                return;
            } else {
                this.action_type = num2;
                return;
            }
        }
        this.icon_src = builder.icon_src;
        this.title = builder.title;
        this.desc = builder.desc;
        this.jump_url = builder.jump_url;
        this.last_update_time = builder.last_update_time;
        this.uni_id = builder.uni_id;
        this.action_type = builder.action_type;
    }
}
