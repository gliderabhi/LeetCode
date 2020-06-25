package FirstSets;

import java.util.*;

public class subdomainvisitCount {
    public static void main(String[] args) {
        String [] dm = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        ArrayList<String> p = out(dm);
        for(String a : p)
            System.out.println(a);
    }

    private static ArrayList<String> out(String[] dm) {
        ArrayList<String> dms = new ArrayList<>();
        HashMap<String, Integer> domns = new HashMap<>();
        for(String s : dm){
            String[] domains = s.split(" ");
            int count = Integer.parseInt(domains[0]);
            //dms = getDomains(domains[1]);

            String domain = domains[1];
            if(domns.containsKey(domain))
                domns.put(domain, domns.get(domain)+count);
            else
                domns.put(domain,count);
            String[] domainParts = domain.split(".");
            for (int i = 1; i <= domainParts.length; i++) {
                StringBuilder domainStr = new StringBuilder();
                for (int j = 0; j < i; j++) {
                    domainStr.insert(0, "." + domainParts[domainParts.length - 1 - j]);
                }
                domainStr.deleteCharAt(0);
                dms.add(domain.toString());
            }
        }

        Iterator iter= domns.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry en = (Map.Entry) iter.next();
            String key = (String) en.getKey();
            String val = String.valueOf( en.getValue());
            dms.add(val + " "+key);
        }
        return dms;


    }

    private static ArrayList<String> getDomains(String domain) {
       ArrayList<String> v = new ArrayList<>();
        for(int i=domain.length()-1; i>=0;i--){
            if(domain.charAt(i) =='.'){
                String one = domain.substring(0,i);
                String two = domain.substring(i+1,domain.length());
                domain = one;
                v.add(one);v.add(two);
                System.out.println(one + " "+ two);
            }
            i--;
        }
        return v;
    }
}
