package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FinanceTabItems extends Message {
    public static final String DEFAULT_DESC_TEXT = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_STATISTIC = "";
    public static final String DEFAULT_TAB_BUBBLE = "";
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TAB_TYPE = "";
    public static final String DEFAULT_TAB_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String desc_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String statistic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tab_bubble;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tab_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FinanceTabItems> {
        public String desc_text;
        public String icon_url;
        public String statistic;
        public String tab_bubble;
        public String tab_name;
        public String tab_type;
        public String tab_url;

        public Builder() {
        }

        public Builder(FinanceTabItems financeTabItems) {
            super(financeTabItems);
            if (financeTabItems == null) {
                return;
            }
            this.tab_name = financeTabItems.tab_name;
            this.tab_url = financeTabItems.tab_url;
            this.icon_url = financeTabItems.icon_url;
            this.desc_text = financeTabItems.desc_text;
            this.tab_bubble = financeTabItems.tab_bubble;
            this.tab_type = financeTabItems.tab_type;
            this.statistic = financeTabItems.statistic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinanceTabItems build(boolean z) {
            return new FinanceTabItems(this, z);
        }
    }

    public FinanceTabItems(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            String str2 = builder.tab_url;
            if (str2 == null) {
                this.tab_url = "";
            } else {
                this.tab_url = str2;
            }
            String str3 = builder.icon_url;
            if (str3 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str3;
            }
            String str4 = builder.desc_text;
            if (str4 == null) {
                this.desc_text = "";
            } else {
                this.desc_text = str4;
            }
            String str5 = builder.tab_bubble;
            if (str5 == null) {
                this.tab_bubble = "";
            } else {
                this.tab_bubble = str5;
            }
            String str6 = builder.tab_type;
            if (str6 == null) {
                this.tab_type = "";
            } else {
                this.tab_type = str6;
            }
            String str7 = builder.statistic;
            if (str7 == null) {
                this.statistic = "";
                return;
            } else {
                this.statistic = str7;
                return;
            }
        }
        this.tab_name = builder.tab_name;
        this.tab_url = builder.tab_url;
        this.icon_url = builder.icon_url;
        this.desc_text = builder.desc_text;
        this.tab_bubble = builder.tab_bubble;
        this.tab_type = builder.tab_type;
        this.statistic = builder.statistic;
    }
}
