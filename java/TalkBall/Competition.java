package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class Competition extends Message {
    public static final String DEFAULT_BTN_TITLE = "";
    public static final List<Country> DEFAULT_COUNTRY = Collections.emptyList();
    public static final Long DEFAULT_TIME = 0L;
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Country> country;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Competition> {
        public String btn_title;
        public List<Country> country;
        public Long time;
        public String type;

        public Builder() {
        }

        public Builder(Competition competition) {
            super(competition);
            if (competition == null) {
                return;
            }
            this.country = Message.copyOf(competition.country);
            this.time = competition.time;
            this.type = competition.type;
            this.btn_title = competition.btn_title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Competition build(boolean z) {
            return new Competition(this, z);
        }
    }

    public Competition(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Country> list = builder.country;
            if (list == null) {
                this.country = DEFAULT_COUNTRY;
            } else {
                this.country = Message.immutableCopyOf(list);
            }
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = l;
            }
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.btn_title;
            if (str2 == null) {
                this.btn_title = "";
                return;
            } else {
                this.btn_title = str2;
                return;
            }
        }
        this.country = Message.immutableCopyOf(builder.country);
        this.time = builder.time;
        this.type = builder.type;
        this.btn_title = builder.btn_title;
    }
}
