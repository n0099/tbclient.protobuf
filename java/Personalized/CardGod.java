package tbclient.Personalized;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes9.dex */
public final class CardGod extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CARD_TITLE = "";
    public static final List<User> DEFAULT_GODS;
    public static final Integer DEFAULT_POSITION;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> gods;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer position;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String card_title;
        public List gods;
        public Integer position;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(CardGod cardGod) {
            super(cardGod);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {cardGod};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (cardGod == null) {
                return;
            }
            this.card_title = cardGod.card_title;
            this.gods = Message.copyOf(cardGod.gods);
            this.position = cardGod.position;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CardGod build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new CardGod(this, z, null);
            }
            return (CardGod) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2099960644, "Ltbclient/Personalized/CardGod;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2099960644, "Ltbclient/Personalized/CardGod;");
                return;
            }
        }
        DEFAULT_GODS = Collections.emptyList();
        DEFAULT_POSITION = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardGod(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.card_title;
            if (str == null) {
                this.card_title = "";
            } else {
                this.card_title = str;
            }
            List list = builder.gods;
            if (list == null) {
                this.gods = DEFAULT_GODS;
            } else {
                this.gods = Message.immutableCopyOf(list);
            }
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
                return;
            } else {
                this.position = num;
                return;
            }
        }
        this.card_title = builder.card_title;
        this.gods = Message.immutableCopyOf(builder.gods);
        this.position = builder.position;
    }

    public /* synthetic */ CardGod(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
