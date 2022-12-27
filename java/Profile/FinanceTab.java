package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FinanceTab extends Message {
    public static final String DEFAULT_GENERAL_TAB_TEXT = "";
    public static final String DEFAULT_GENERAL_TAB_URL = "";
    public static final List<FinanceTabItems> DEFAULT_TABS = Collections.emptyList();
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String general_tab_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String general_tab_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<FinanceTabItems> tabs;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FinanceTab> {
        public String general_tab_text;
        public String general_tab_url;
        public List<FinanceTabItems> tabs;
        public String title;

        public Builder() {
        }

        public Builder(FinanceTab financeTab) {
            super(financeTab);
            if (financeTab == null) {
                return;
            }
            this.title = financeTab.title;
            this.general_tab_text = financeTab.general_tab_text;
            this.general_tab_url = financeTab.general_tab_url;
            this.tabs = Message.copyOf(financeTab.tabs);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinanceTab build(boolean z) {
            return new FinanceTab(this, z);
        }
    }

    public FinanceTab(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.general_tab_text;
            if (str2 == null) {
                this.general_tab_text = "";
            } else {
                this.general_tab_text = str2;
            }
            String str3 = builder.general_tab_url;
            if (str3 == null) {
                this.general_tab_url = "";
            } else {
                this.general_tab_url = str3;
            }
            List<FinanceTabItems> list = builder.tabs;
            if (list == null) {
                this.tabs = DEFAULT_TABS;
                return;
            } else {
                this.tabs = Message.immutableCopyOf(list);
                return;
            }
        }
        this.title = builder.title;
        this.general_tab_text = builder.general_tab_text;
        this.general_tab_url = builder.general_tab_url;
        this.tabs = Message.immutableCopyOf(builder.tabs);
    }
}
