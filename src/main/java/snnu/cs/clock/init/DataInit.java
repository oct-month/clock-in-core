package snnu.cs.clock.init;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import snnu.cs.clock.dao.CopyWritingDao;
import snnu.cs.clock.entity.CopyWriting;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataInit implements CommandLineRunner
{
    @Autowired
    private CopyWritingDao dao;

    private String[] datas = {
        "学习注重一个节奏，节奏不能断，也就是你不能一天不看书，断一天的节奏，一个周补不回来。很可怕!",
        "人性最可怜的就是：我们总是梦想着天边的一座奇妙的玫瑰园，而不去欣赏今天就开在我们窗口的玫瑰。",
        "每个月月底一个大休，周日适当休息，其余时间按计划进行，雷打不动，即使下冰雹，哪怕下刀子，去上自习!",
        "考研的日子在逼近，希望你能调整好自己的心态，好好发挥，考上理想的公大!我在为你祝福。一定会成功的!",
        "没有了旋律，就没有了诗歌，没有了色彩，那是怎么样的生活?愿春天赋于你绚丽是色彩无限的希望美好的未来。",
        "痛苦你来吧，失去了再多又怎样，有本事你就来得更猛些啊，看看谁怕谁!",
        "我不在乎你过去作什么，只在乎你现在干什么!",
        "任何人的成功都来源于自觉自愿地去寻找机会，发挥创造力。如果你只会坐井观天，守株待兔，那么你永远只能是井底之蛙，永远逮不着那千分之一几率的兔子。",
        "学习时的苦痛是暂时的，未学到的痛苦是终生的。",
        "考研不是无间道，而是开往春天的地铁!",
        "千万别摸着石头过河，要清楚最终追求是什么，究竟想成为什么样的人，当别人都迷迷糊糊的时候，你千万别也迷迷糊糊的。",
        "失败是什么?没有什么，只是更走近成功一步;成功是什么?就是走过了所有通向失败的路，只剩下一条路，那就是成功的路。",
        "今天就要参加考试了，送你一条幸运短信，据说在考试当天能收到这样一条短信，就会考出自己满意的成绩，祝你考试好运气啊!",
        "考研的朋友们，明天就要上战场了，挑卡网全体员工，在此给大家最真挚的祝福：黎明前的黑暗，光明即将来临，祝福大家考研成功!",
        "别驻足，梦想要不停追逐;不认输，熬过黑夜是日出;都清楚，成功就在下一步;路很苦，汗水是最美的书;狂欢呼，相约在巅峰共舞!",
        "失败好比强奸，你不反抗他就会有下一次!",
        "人生路多歧，有舍取，有所为;有所不为，才能大有所为。",
        "尽量在今天多做点事情，不要把事情推到明天。因为这个世界没有明天，而且你更不知道明天会发生什么，留住今天，充实今天!",
        "一个人生活中的失意乃至失败在很大程度上来说是心理的而不是现实的，是技术性的而不是宿命的。现实至多为失败者提供了解脱的借口，而对宿命的信仰最终无情地扑灭了成功的任何希望。",
        "如果说每一次降落是为了更好的起飞，那么每一次降落后的起飞就应该飞得更高更远!",
        "在一个人奋斗的道路上，你也许会孤单寂寞，可是别忘了，朋友的祝福还在，父母的叮咛还在，对希望的追求还在，至少你的信仰还在。那么再苦再累算什么，你将永远不会孤独，你将永远的走下去。",
        "考研是自己选择的最愿意去走的道路，不管前面会遇到什么，考研的决心一旦作出就要义无反顾、勇往直前。",
        "天将降大任于斯人也，必先苦其心志，劳其筋骨，为了自己的目标，必须付出许多代价才能达到，没有天上掉下来的馅饼!",
        "当一切成为过去的时候，你对过去就会不以为然了。所以我相信只要你对未来有梦想，并且踏踏实实的走过为将来奋斗的路，你会收获很多的。所以我祝愿所有拥有自己梦想的朋友，选择了就义无返顾的坚持下去，这样在不久的将来，回收获微笑的!",
        "考研是我证明自己价值的最直接的路，是我改变自己现在生活状态的捷径，是我真正体验高校生活的唯一的路。",
        "告诉我，你现在除了努力学习还能做什么?什么还能改变你的命运?既然没有，那么你就没有退路，考上清华研究生!",
        "学如逆水行舟，逆水行舟用力撑，一篙松劲退千寻，此日足可惜，吾辈更应惜秒音。",
    };

    @Override
    public void run(String... args) throws Exception
    {
        dao.deleteAll();
        List<CopyWriting> cps = new ArrayList<>();
        for (String content : datas)
        {
            CopyWriting c = new CopyWriting(content);
            cps.add(c);
        }
        dao.saveAllAndFlush(cps);
    }
}
