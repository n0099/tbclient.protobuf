package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class UniversityTabInfo extends Message {
    public static final List<UniversityInfo> DEFAULT_CONTENT = Collections.emptyList();
    public static final String DEFAULT_TAB_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<UniversityInfo> content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tab_name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<UniversityTabInfo> {
        public List<UniversityInfo> content;
        public String tab_name;

        public Builder() {
        }

        public Builder(UniversityTabInfo universityTabInfo) {
            super(universityTabInfo);
            if (universityTabInfo == null) {
                return;
            }
            this.tab_name = universityTabInfo.tab_name;
            this.content = Message.copyOf(universityTabInfo.content);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UniversityTabInfo build(boolean z) {
            return new UniversityTabInfo(this, z);
        }
    }

    public UniversityTabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            List<UniversityInfo> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.tab_name = builder.tab_name;
        this.content = Message.immutableCopyOf(builder.content);
    }
}
