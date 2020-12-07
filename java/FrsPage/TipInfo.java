package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class TipInfo extends Message {
    public static final String DEFAULT_TIP_INTERVAL = "";
    public static final String DEFAULT_TIP_NAME = "";
    public static final String DEFAULT_TIP_NOTICE = "";
    public static final String DEFAULT_TIP_POP = "";
    public static final String DEFAULT_TIP_POP_TITLE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tip_interval;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tip_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tip_notice;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tip_pop;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tip_pop_title;

    private TipInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tip_name == null) {
                this.tip_name = "";
            } else {
                this.tip_name = builder.tip_name;
            }
            if (builder.tip_pop_title == null) {
                this.tip_pop_title = "";
            } else {
                this.tip_pop_title = builder.tip_pop_title;
            }
            if (builder.tip_pop == null) {
                this.tip_pop = "";
            } else {
                this.tip_pop = builder.tip_pop;
            }
            if (builder.tip_notice == null) {
                this.tip_notice = "";
            } else {
                this.tip_notice = builder.tip_notice;
            }
            if (builder.tip_interval == null) {
                this.tip_interval = "";
                return;
            } else {
                this.tip_interval = builder.tip_interval;
                return;
            }
        }
        this.tip_name = builder.tip_name;
        this.tip_pop_title = builder.tip_pop_title;
        this.tip_pop = builder.tip_pop;
        this.tip_notice = builder.tip_notice;
        this.tip_interval = builder.tip_interval;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<TipInfo> {
        public String tip_interval;
        public String tip_name;
        public String tip_notice;
        public String tip_pop;
        public String tip_pop_title;

        public Builder() {
        }

        public Builder(TipInfo tipInfo) {
            super(tipInfo);
            if (tipInfo != null) {
                this.tip_name = tipInfo.tip_name;
                this.tip_pop_title = tipInfo.tip_pop_title;
                this.tip_pop = tipInfo.tip_pop;
                this.tip_notice = tipInfo.tip_notice;
                this.tip_interval = tipInfo.tip_interval;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TipInfo build(boolean z) {
            return new TipInfo(this, z);
        }
    }
}
