package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TopNotice extends Message {
    public static final String DEFAULT_AUTHOR = "";
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TITLE_LINK = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title_link;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TopNotice> {
        public String author;
        public Integer id;
        public String title;
        public String title_link;

        public Builder() {
        }

        public Builder(TopNotice topNotice) {
            super(topNotice);
            if (topNotice == null) {
                return;
            }
            this.title = topNotice.title;
            this.title_link = topNotice.title_link;
            this.author = topNotice.author;
            this.id = topNotice.id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopNotice build(boolean z) {
            return new TopNotice(this, z);
        }
    }

    public TopNotice(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.title_link;
            if (str2 == null) {
                this.title_link = "";
            } else {
                this.title_link = str2;
            }
            String str3 = builder.author;
            if (str3 == null) {
                this.author = "";
            } else {
                this.author = str3;
            }
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
                return;
            } else {
                this.id = num;
                return;
            }
        }
        this.title = builder.title;
        this.title_link = builder.title_link;
        this.author = builder.author;
        this.id = builder.id;
    }
}
