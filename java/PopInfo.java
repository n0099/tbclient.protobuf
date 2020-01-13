package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class PopInfo extends Message {
    public static final String DEFAULT_AHEAD_INFO = "";
    public static final String DEFAULT_AHEAD_URL = "";
    public static final Integer DEFAULT_IF_POP = 0;
    public static final String DEFAULT_OK_INFO = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_V_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ahead_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer if_pop;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ok_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String v_title;

    private PopInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.if_pop == null) {
                this.if_pop = DEFAULT_IF_POP;
            } else {
                this.if_pop = builder.if_pop;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.v_title == null) {
                this.v_title = "";
            } else {
                this.v_title = builder.v_title;
            }
            if (builder.ahead_info == null) {
                this.ahead_info = "";
            } else {
                this.ahead_info = builder.ahead_info;
            }
            if (builder.ahead_url == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = builder.ahead_url;
            }
            if (builder.ok_info == null) {
                this.ok_info = "";
                return;
            } else {
                this.ok_info = builder.ok_info;
                return;
            }
        }
        this.if_pop = builder.if_pop;
        this.title = builder.title;
        this.v_title = builder.v_title;
        this.ahead_info = builder.ahead_info;
        this.ahead_url = builder.ahead_url;
        this.ok_info = builder.ok_info;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PopInfo> {
        public String ahead_info;
        public String ahead_url;
        public Integer if_pop;
        public String ok_info;
        public String title;
        public String v_title;

        public Builder() {
        }

        public Builder(PopInfo popInfo) {
            super(popInfo);
            if (popInfo != null) {
                this.if_pop = popInfo.if_pop;
                this.title = popInfo.title;
                this.v_title = popInfo.v_title;
                this.ahead_info = popInfo.ahead_info;
                this.ahead_url = popInfo.ahead_url;
                this.ok_info = popInfo.ok_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PopInfo build(boolean z) {
            return new PopInfo(this, z);
        }
    }
}
