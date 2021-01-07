package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Sender extends Message {
    public static final Long DEFAULT_ID = 0L;
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;

    private Sender(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name_show == null) {
                this.name_show = "";
            } else {
                this.name_show = builder.name_show;
            }
            if (builder.portrait == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = builder.portrait;
                return;
            }
        }
        this.id = builder.id;
        this.name_show = builder.name_show;
        this.portrait = builder.portrait;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Sender> {
        public Long id;
        public String name_show;
        public String portrait;

        public Builder() {
        }

        public Builder(Sender sender) {
            super(sender);
            if (sender != null) {
                this.id = sender.id;
                this.name_show = sender.name_show;
                this.portrait = sender.portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Sender build(boolean z) {
            return new Sender(this, z);
        }
    }
}
