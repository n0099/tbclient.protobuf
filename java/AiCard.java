package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AiCard extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_UK = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long pa;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer position;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String uk;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_PA = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AiCard> {
        public String content;
        public Long pa;
        public String portrait;
        public Integer position;
        public String title;
        public String uk;

        public Builder() {
        }

        public Builder(AiCard aiCard) {
            super(aiCard);
            if (aiCard == null) {
                return;
            }
            this.title = aiCard.title;
            this.content = aiCard.content;
            this.position = aiCard.position;
            this.pa = aiCard.pa;
            this.uk = aiCard.uk;
            this.portrait = aiCard.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AiCard build(boolean z) {
            return new AiCard(this, z);
        }
    }

    public AiCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num;
            }
            Long l = builder.pa;
            if (l == null) {
                this.pa = DEFAULT_PA;
            } else {
                this.pa = l;
            }
            String str3 = builder.uk;
            if (str3 == null) {
                this.uk = "";
            } else {
                this.uk = str3;
            }
            String str4 = builder.portrait;
            if (str4 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str4;
                return;
            }
        }
        this.title = builder.title;
        this.content = builder.content;
        this.position = builder.position;
        this.pa = builder.pa;
        this.uk = builder.uk;
        this.portrait = builder.portrait;
    }
}
